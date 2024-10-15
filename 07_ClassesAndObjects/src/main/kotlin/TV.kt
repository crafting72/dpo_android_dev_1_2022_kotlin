package org.example

class TV (val brand: String, val model: String, val diagonalSize: Int) {

    var currentVolume: Int = 0
        private set
    var currentChannel: Int = 1
        private set
    private val channelList = Channels.getRandomChannels()
    private val maximumChannel = channelList.size
    var status: String = "Off"
        private set

    fun onTV(){
        status = "On"
    }

    fun offTV(){
        status = "Off"
    }

    fun increaseTheVolume(value: Int){
        if (currentVolume + value >= MAXIMUM_VOLUME) currentVolume = MAXIMUM_VOLUME
        else currentVolume += value
    }

    fun volumeReduction(value: Int){
        if (currentVolume - value <= 0) currentVolume = 0
        else currentVolume -= value
    }

    fun switchingTheChannelToTheSpecifiedOne(value: Int){
        status = "On"
        if (value in 1..maximumChannel) currentChannel = value
        else println("There is no such channel.")
    }

    fun switchingChannelsOnTheRemote(value: String){
        if (status == "Off") status = "On"
        else {
            if (value == "Up") if (currentChannel == maximumChannel) currentChannel = 1 else currentChannel += 1
            else if (currentChannel == 1) currentChannel = maximumChannel else currentChannel -= 1
        }
    }

    fun showChannelList(){
        println("List of channels:")
        channelList.forEachIndexed { index, value -> println("${index + 1} - $value") }
    }

    companion object {
        const val MAXIMUM_VOLUME: Int = 100
    }
}