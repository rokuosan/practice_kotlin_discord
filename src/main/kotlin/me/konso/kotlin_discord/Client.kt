package me.konso.kotlin_discord

import com.jagrosh.jdautilities.command.CommandClientBuilder
import me.konso.kotlin_discord.commands.*
import me.konso.kotlin_discord.events.VoiceChat
import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.entities.Activity
import net.dv8tion.jda.api.events.ReadyEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import net.dv8tion.jda.api.requests.GatewayIntent

class Client: ListenerAdapter() {
    private lateinit var jda: JDA
    private val commandPrefix = "."

    fun main(token: String){
        // コマンドを扱うイベントリスナを作成
        val commandClient = CommandClientBuilder()
            .setPrefix(commandPrefix) // 接頭辞
            .setOwnerId("")
            .setActivity(Activity.competing("スマブラ"))
            .addCommands(Neko(), Capitalize(), Ping(), Info())
            .build()

        jda = JDABuilder.createLight(token,
        GatewayIntent.GUILD_MESSAGES)
            .addEventListeners(commandClient, VoiceChat())
            .build()
    }

    override fun onReady(event: ReadyEvent) {
        // Bot がログインした時の処理
        println("The bot is ready!")
    }
}