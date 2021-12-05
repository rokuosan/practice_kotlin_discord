package me.konso.kotlin_discord.commands

import com.jagrosh.jdautilities.command.Command
import com.jagrosh.jdautilities.command.CommandEvent
import java.util.*

class Capitalize: Command() {
    init{
        this.name = "cap"
        this.help = "文字の先頭を大文字にするだけ"
    }

    override fun execute(event: CommandEvent?) {
        if(event?.args?.isEmpty()==false){
            event.reply(event.args.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
        }
    }
}