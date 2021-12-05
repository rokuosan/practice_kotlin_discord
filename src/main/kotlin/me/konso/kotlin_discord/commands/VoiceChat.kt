package me.konso.kotlin_discord.commands

import com.jagrosh.jdautilities.command.Command
import com.jagrosh.jdautilities.command.CommandEvent

class Summon: Command() {
    init {
        this.name = "summon"
        this.help = "Summon the bot to your voice chat"
    }

    override fun execute(event: CommandEvent?) {
        event?:return
    }
}