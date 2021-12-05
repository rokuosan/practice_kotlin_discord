package me.konso.kotlin_discord.commands

import com.jagrosh.jdautilities.command.Command
import com.jagrosh.jdautilities.command.CommandEvent

class Info: Command() {
    init {
        this.name = "info"
        this.help = "Show your information"
    }

    override fun execute(event: CommandEvent?) {
        event?:return
        event.reply("AccountType: ${event.jda.accountType}")
        event.reply("EventManager: ${event.jda.eventManager}")
        event.reply("SharedInfo: ${event.jda.shardInfo}")
        event.reply("CallbackPool: ${event.jda.callbackPool}")
    }
}