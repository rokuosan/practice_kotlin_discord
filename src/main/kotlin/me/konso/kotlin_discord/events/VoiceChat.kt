package me.konso.kotlin_discord.events

import net.dv8tion.jda.api.events.DisconnectEvent
import net.dv8tion.jda.api.events.channel.voice.GenericVoiceChannelEvent
import net.dv8tion.jda.api.events.channel.voice.update.GenericVoiceChannelUpdateEvent
import net.dv8tion.jda.api.events.guild.voice.GuildVoiceJoinEvent
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class VoiceChat: ListenerAdapter() {

    override fun onGuildVoiceJoin(event: GuildVoiceJoinEvent) {
//        super.onGuildVoiceJoin(event)
        println("AAAAAAAA")
    }
}