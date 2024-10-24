# The purpose of the homework.
To consolidate the work with Flow in practice.

# What needs to be done.
In this homework assignment, you need to develop a program that simulates the board game "Lotto". The rules of this game are quite simple:

- 90 barrels take part in the game. Each of the barrels has its number printed on it. All barrels are placed in a special opaque bag and mixed before the start of the game.
- The game card consists of three lines, each of them has nine cells, five of which are occupied by numbers. Empty cells are not intended for the game. The numbers on one card cannot be repeated. If desired, you can arrange the numbers on the card in ascending order (for the convenience of the player).

![](https://github.com/user-attachments/assets/21c79e4e-5206-4cee-a5aa-d52a68606a84)

- Each player takes one or more cards for himself, and the number of playing cards for each player must be the same. 
- The presenter takes one of the barrels out of the bag. Each player checks if there is such a number on his playing cards. If the number announced by the leader is on the game card, the player closes it with a special marker. If there is no such number, the player waits for the announcement of the next number.
- Barrels are taken until one of the players wins.

There are two variants of the game:

- The player who first closes all five numbers of any row on the game card with markers wins;
- The player who is the first to completely cover all the numbers on one game card with markers wins.

Choose one of the game options and implement it using coroutine and flow:

1. Create the necessary classes and objects. For example, a number generator is suitable for the role of a presenter.
2. Distribute data between these classes and objects using various flows. Choose the most appropriate option for this task.
3. The program must be executed in accordance with the described rules and simulate the game of several players. Pay special attention to the following points:
  - data production (data transfer to flow) must stop after one of the players wins;
  - all collectors must unsubscribe from flow, that is, stop receiving data after one of the players wins;
  - the program must terminate correctly, all coroutines must complete their execution.

Be careful and follow the principles of responsibility of the various components so that the code is not confusing.

# Output
