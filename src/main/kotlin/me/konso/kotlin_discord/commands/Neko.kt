package me.konso.kotlin_discord.commands

import com.jagrosh.jdautilities.command.Command
import com.jagrosh.jdautilities.command.CommandEvent

class Neko: Command(){
    init{
        this.name = "neko"
    }

    override fun execute(event: CommandEvent?) {
        event?.reply("Meow!")
    }
}