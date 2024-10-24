# Homework goals
- Create your own class hierarchy.
- In practice, consider the principles of encapsulation and inheritance.
- In practice, consider the specifics of working with parent and derived classes.

# What needs to be done
To develop a console program simulating the life cycle of animals in the reserve.
1. Create an animal class Animal.
2. The animal must have characteristics:
  - energy,
  - weight, 
  - current age,
  - maximum age,
  - name.
  
  Energy, weight, maximum age and name must be initialized through the constructor.
3. Add the calculated isTooOld — Boolean property. It should compare the current age with the maximum and return true if the current age is equal to or greater than the maximum.
4. The animal can sleep, eat and move around. 
  During sleep: 
  - The animal's energy increases by 5, and its age increases by 1.
  - A message is displayed in the console: "${animal name} is sleeping."
  During meals:
  - The animal's energy increases by 3, and its weight increases by 1.
  - The age of the animal may increase by 1.
  - The console displays the message: "${animal name} is eating."
  While traveling: 
  - The animal's energy decreases by 5, and its weight decreases by 1.
  - The age of the animal may increase by 1.
  - The console displays the message: "${animal name} is moving".
5. Implement a random increase in age using the Random class from the kotlin.random package and the method.nextBoolean().
  Usage example:
  ![](https://github.com/user-attachments/assets/5c1534ac-517b-42b8-b266-632839a8bd93)
  Add a random increase in age to the — tryIncrementAge method
  If the animal is too old, if there is not enough weight or energy to perform an action, then nothing happens.
6. An animal can produce offspring. 
  The name and maximum age of the born animal are the same as that of the parent.
  The energy for a born animal is randomly set in the range from 1 to 10. 
  The weight for a born animal is set randomly in the range from 1 to 5. 
  The console should display a message about which animal was born and what characteristics it has.
7. Create inheritors of the Animal class: Bird, Fish, Dog. 
8. In each of the heirs, redefine the function responsible for movement. For each heir in this function, it is necessary to call the parent implementation and additionally output a message to the console:
  - for Bird — "Flying",
  - for Fish — "Swims",
  - for Dog — "Running".
  Optional: ensure that the additional message is displayed only if the parent implementation is executed.
9. In each of the heirs, redefine the function responsible for the birth of a descendant. The Fish class must return an object of the Fish class. Similarly with Bird and Dog.
10. Create a NatureReserve class, which is a nature reserve with different animals.
11. Initialize the reserve. Initially, there should be five birds, three fish, two dogs and several ordinary animals. 
12. Write a program that simulates the life cycle of animals in the reserve. 
  For a limited number of iterations, N, each animal does one random action that its properties allow it to do: eat, sleep, move, give birth. 
  When an animal has a cub, it is added to the total number of animals in the reserve. 
  At the end of the iteration, all animals whose age has exceeded the maximum are removed from the reserve. 
  At the end of the work, the number of animals in the reserve that remained alive should be displayed. 
  If all the animals have disappeared, the program should be interrupted, with the output of the corresponding message.
# Output
![](https://github.com/user-attachments/assets/3724042a-2c94-4d30-8eff-45615902b934)
![](https://github.com/user-attachments/assets/536c39de-a128-4210-83a6-f1fc8159a6ba)
![](https://github.com/user-attachments/assets/041136ba-0f76-4896-bf52-0de2704f2250)
![](https://github.com/user-attachments/assets/d909be6d-b762-4804-b760-8a7175292de1)
![](https://github.com/user-attachments/assets/66ee0caf-6709-400f-901d-2a97aa46b84a)
![](https://github.com/user-attachments/assets/d5402fc2-b8b9-41b2-8f45-d81395c88e84)
