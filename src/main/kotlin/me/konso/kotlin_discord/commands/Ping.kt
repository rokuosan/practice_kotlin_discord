package me.konso.kotlin_discord.commands

import com.jagrosh.jdautilities.command.Command
import com.jagrosh.jdautilities.command.CommandEvent

class Ping: Command() {
    init {
        this.name = "ping"
        this.help = "Send ping"
    }

    override fun execute(event: CommandEvent?) {
        event?: return
        event.reply("Pong!:\n- gatewayPing is ${event.jda.gatewayPing}ms")
    }

}