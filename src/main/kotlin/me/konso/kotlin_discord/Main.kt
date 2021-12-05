package me.konso.kotlin_discord

import java.io.FileOutputStream
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths
import java.util.Properties

fun main(){
    // プロパティ読み込み
    val property = Properties()
    try{
        // ロード
        property.load(Files.newBufferedReader(Paths.get("settings.properties"), StandardCharsets.UTF_8))
    }catch (e: Exception){
        // 失敗
        println("Failed to load API key.")
        // プロパティの作成
        print("Please enter your API key: ")
        val key = scanner()
        property.setProperty("api", key)
        try {
            property.store(FileOutputStream("settings.properties"), "For Connect to Discord")
        } catch(er: Exception) {
            println("Failed to Open Stream")
            return
        }
        return
    }
    val key = property.getProperty("api")

    val bot = Client()
    bot.main(key)
}

fun scanner(): String{
    val str = readLine()?: "Unknown Error"
    return str.ifBlank {
        scanner()
    }
}