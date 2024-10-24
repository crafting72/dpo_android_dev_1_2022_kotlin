# Homework goals
Learn:
- declare your own classes;
- create instances of classes, call their methods, access properties;
- create objects and work with them.

# What needs to be done
Create your own TV class that describes a variety of TVs and has all the listed characteristics and actions.
1. The class has the following properties:
  - **make, model, diagonal size** — these properties are readable, it is possible to create TVs of different models and sizes;
  - **enabled/disabled** — the property is read-only and not writable;
  - **The channel list** is an internal property of the TV, not readable;
  - **The maximum volume** is an internal property, the value is constant, therefore it is located in the companion object of this class.
2. The class has the following functions:
  - switching on/off;
  - increase the volume by a preset amount;
  - decrease the volume by a preset amount;
  - switching the channel to a preset one (analogous to pressing the channel number button on the remote control); if the TV is turned off, then using this function turns on the TV and switches the channel to the preset one;
  - switching channels in ascending and descending order (analogous to pressing the channel switching buttons "Up" and "Down" on the remote control); if the TV is turned off, then using these functions turns on the TV on the channel that was before turning off; switching channels continuously: after the last channel, the first one from the list turns on;
  - representation of the channel list in the form of $ordinal number — $channel name to display.
3. When creating an object of the "TV" class, channels are configured. The channel list is filled with random non-repeating channels. To get random channels, declare your own object Channels. It should contain a list of all possible channels and the getRandomChannels function, which will return a list of random channels. You can implement this function yourself. One of the implementation options:
  - use the shuffle function to shuffle the list of channels;
  - From there, select the required amount for each TV.
4. The channel lists vary from TV to TV. The size of the TV channel list may vary.
5. Channels are represented by lines with the name. Optionally, create an additional Channel class to describe the channel.
6. Write a program that creates multiple instances of TVs.
  - For each instance, output information about this TV.
  - For each instance, call all available functions and make sure they work correctly. To do this, add information about the current values of the instance fields to the console for each called function. For example, add the output of the updated value of the current volume to the volume up function.
  - Use cycles to check the volume control and sequential channel switching functions.
  - All function calls are handled correctly if the TV is turned off (unless otherwise stated).

# Output
(https://github.com/user-attachments/assets/ad636054-0932-4b91-bbba-2e059031f365)
