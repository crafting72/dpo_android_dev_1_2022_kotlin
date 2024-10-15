package org.example

import kotlin.random.Random

object Channels {
    private val allChannellist = listOf("Nova Cinema","Rádio Impuls","Zak TV","ČT1","Óčko","ČT 24","ČT :D",
        "Regionální TV", "ČT sport", "Óčko Gold", "TV Nova", "Nova Sport 2", "Nova International", "TV Noe",
        "Óčko Expres", "Nova Sport 1", "Telka", "Česká televize 2", "ČT art", "LTV Plus", "Fanda", "Radio BEAT")
    fun getRandomChannels() = List(size = Random.nextInt(5, 15)) { allChannellist.shuffled()[it] }
}