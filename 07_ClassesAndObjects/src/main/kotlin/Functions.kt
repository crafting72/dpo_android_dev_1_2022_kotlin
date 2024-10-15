package org.example

fun infoTV(value: TV){
    println("""Brand - ${value.brand}, Model - ${value.model}, Diagonal size - ${value.diagonalSize}
        |Status - ${value.status}, Current channel - ${value.currentChannel}, Current volume - ${value.currentVolume}
    """.trimMargin())
    Thread.sleep(500)
}

fun upChannel(value: TV){
    value.switchingChannelsOnTheRemote("Up")
    println("Current channel - ${value.currentChannel}")
    Thread.sleep(500)
}

fun downChannel(value: TV){
    value.switchingChannelsOnTheRemote("Down")
    println("Current channel - ${value.currentChannel}")
    Thread.sleep(500)
}

fun switchingChannels(value: TV, channel: Int){
    value.switchingTheChannelToTheSpecifiedOne(channel)
    println("Current channel - ${value.currentChannel}")
    Thread.sleep(500)
}

fun onTV(value: TV){
    value.onTV()
    println("Status - ${value.status}")
    Thread.sleep(500)
}

fun offTV(value: TV){
    value.offTV()
    println("Status - ${value.status}")
    Thread.sleep(500)
}

fun increaseThVolumeTV(value: TV, volume: Int){
    value.increaseTheVolume(volume)
    println("Current volume - ${value.currentVolume}")
    Thread.sleep(500)
}

fun volumeReductionTV(value: TV, volume: Int){
    value.volumeReduction(volume)
    println("Current volume - ${value.currentVolume}")
    Thread.sleep(500)
}

fun usingAllFunctionsAndCheck(value: TV){
    infoTV(value)
    onTV(value)
    offTV(value)
    onTV(value)
    switchingChannels(value, 5)
    switchingChannels(value, 10)
    switchingChannels(value, 20)
    switchingChannels(value, 1)
    repeat(102) {
        increaseThVolumeTV(value, 1)
    }
    repeat(102){
        volumeReductionTV(value, 1)
    }
    repeat(20){
        upChannel(value)
    }
    repeat(20){
        downChannel(value)
    }
    value.showChannelList()
    offTV(value)
    switchingChannels(value, 2)
    offTV(value)
    upChannel(value)
    offTV(value)
    downChannel(value)
    offTV(value)
}