plugins {
    kotlin("jvm") version "1.5.10"
    java
//    application
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "me.konso"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://m2.dv8tion.net/releases")
    maven("https://m2.chew.pro/releases")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("net.dv8tion:JDA:4.4.0_350") // Java Discord API
    implementation ("pw.chew:jda-chewtils:1.23.0") // Java Discord API でコマンドを実装する
    implementation( "com.sedmelluq:lavaplayer:1.3.77") // Java Discord API で音声を使用する
    implementation("ch.qos.logback:logback-classic:1.2.7") // Java Discord API でログをとる
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

//application {/*applicationブロックごと追記*/
//    mainClass.set("${group}.${rootProject.name}.MainKt")
//    /*pluginブロック内のapplicationと同時に書いた場合ブロックに警告が出ますが続行してください。*/
//}