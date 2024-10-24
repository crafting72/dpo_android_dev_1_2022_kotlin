# Homework goals
Learn:
- create and call your own functions,
- use lambda expressions,
- and create higher-order functions.

# What needs to be done
I encrypted some message. The algorithm I used looks like this: 
1. Split the message in half.
2. Process the first half of the message as follows:

2.1. In the source text, replace all the characters o with the character 0 (zero).

2.2. In the resulting text, replace each character of the message with a character standing 3 to the right of the original (shift each character to the right by 3).

2.3. In the resulting text, replace all the characters u with the digit 4.

2.4. In the resulting text replace all s characters with the number 5.

2.5. In the resulting text, replace each character of the message with a character standing 1 to the left of the original (shift each character to the left by 1).
3. Process the second half of the message as follows:

3.1. Replace spaces with a character _

3.2. In the resulting text, replace each character of the message with a character standing 4 to the right of the original (shift each character to the right by 4).

3.3. Expand the resulting string.
4. Connect both encrypted halves.

As a result of the algorithm, I got the string: **F2p)v"y233{0->c}ttelciFc**
Write a program that will decrypt the message and output the original message to the console.
To decrypt the text, write functions that will pass the algorithm in the opposite direction: for example, replace all characters 5 with the character s — the reverse action for paragraph 2.4 of my algorithm.
1. Create a function to decrypt the first half of the message. Use the reverse algorithm for this.
2. Create a function to decrypt the second half of the message. Use the reverse algorithm for this.
3. Optional. Create a higher-order shift() function that can be used to shift all characters in a string. The function should:
- accept a string and a conversion function for the current character as input (a functional type parameter);
- return the modified string.
Use this function in functions 1 and 2.

# Output
![](https://github.com/user-attachments/assets/7ce22fdc-fa19-4bc1-a3e3-91e245d1567f)
