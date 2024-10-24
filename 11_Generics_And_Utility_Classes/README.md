# Objectives of the task
- Create your own generalized classes.
- To consolidate work with data classes, sealed classes, enum classes, and extensions in practice.
- Apply the principles of OOP and interaction between different objects to solve a practical problem.

# What needs to be done
It is necessary to develop a console program that simulates a battle between two teams, monitors the progress of the battle and collects information about it.

The team consists of warriors, each of whom has basic characteristics and weapons, depending on which class of warriors he belongs to. For example: a soldier or a captain.

The battle takes place step by step: each warrior from a team attacks an opponent from another team, and can also be attacked on the next turn of the opponent.

Formulate and implement additional rules of battle and criteria for the victory of one of the teams yourself. The program should collect the necessary information and display the current course of the battle in the console.

In this homework assignment, you will have to bring together the previously acquired knowledge from all previous modules and turn them into practical skills. Since the work generalizes and consolidates the material of several modules, its execution may take longer than usual. At the same time, you will get a complex, holistic product that is as close as possible to a real work task. In the future, this program can be expanded with new functionality, as well as work out future topics on it.

## Part 1
To complete the task, you need to develop an additional Generic class and use it in the main program.

One of the standard collections in programming is Stack. This collection is characterized by the fact that it stores items in an ordered form according to the principle of Last in first out — last in, first out. That is, the first element added to the stack is extracted from it last.

**Note**: This collection is not represented in the standard Kotlin class library. But it is implemented in Java, and since we are considering Kotlin JVM, there is access to this collection.

1. Create a Generic Stack<T> class that will store items according to the rules of the Stack collection.
2. Create functions in this class:
    1. push(item: T) — adds an item to the stack.
    2. pop(): T? — extracts an element from the stack. If the stack is empty, it returns null.
    3. isEmpty(): Boolean — checks the stack for the presence of elements.
3. Check that the class is working correctly in accordance with the stack rules.

## Part 2

Develop a program:
- The user enters the number of warriors in the team.
- The battle begins. 
- The battle takes place automatically and step by step until one of the teams wins or draws.
- Each turn collects and displays current information about the status of the battle.
- At the end of the battle, the winning team or a draw is displayed.

To do this, you will need the following components:

1. An extension function for the Int type. It should calculate whether the chance has been realized and return a Boolean. Use this function for probability-related checks. The function must be implemented by calling Random.nextInt(). 

2. Ammo enumeration (enum) for types of cartridges.

Features:

- damage,
- critical damage chance, 
- critical damage coefficient.

Methods: 

- getting the current damage (calculates the current damage according to the chance of critical damage and the critical damage coefficient).

**Critical damage** — significantly more damage, which is inflicted with a certain probability. It is calculated using the formula **Critical damage = coefficient * damage.**

Each cartridge has the ability to deal critical damage. This chance is represented by the property "**Critical Damage Chance**". For example, a 25% chance of critical damage means that there is a 25% chance that the cartridge will deal damage equal to **damage * coefficient**.

The list should contain at least three types of cartridges with different parameters. To check if the damage is critical, use the extension function from point 1.

3. Sealed class for the type of FireType shooting.

Create heirs:

- single shot (singleton object),
- firing in bursts (data class, takes the "queue size" parameter in the constructor).
Create additional shooting types if necessary.

4. AbstractWeapon weapon class.

Features:

- The maximum number of rounds in the magazine.
- Type of shooting (FireType).
- Ammo magazine. Use the Stack class from the first part of the homework. When creating a weapon, the store is empty.
- The fact that there are cartridges in the magazine.

Methods:

- creation of a cartridge of the required type;
- Reloading — a new magazine is created and filled with cartridges using the cartridge creation function;
- getting cartridges for the shot — cartridges are obtained from the magazine in accordance with the type of shooting for the shot(s) (the number of cartridges in the magazine should decrease).

5. Singleton is a Weapons object that creates different types of weapons. The Weapons object should create anonymous AbstractWeapon objects. Create at least four methods for different types of weapons.

Work example: val pistol: Abstract Weapon = Weapons.create Pistol().

6. The Warrior interface.

Features: 

- isKilled,
- a chance to avoid being hit.

Methods: 

- attack — takes the enemy (Warrior) at the entrance,
- take damage — takes the amount of damage at the entrance.

7. Abstract Warrior Abstract class, which implements the Warrior interface.

Features:

- maximum health level,
- Evasion is a chance to avoid being hit,
- accuracy — hit probability,
weapon,
- current health level.

Methods:

- Attack (interface method) — if there are no bullets in the weapon, reload the weapon and skip the turn. Otherwise, get ammo to fire. For each of them, check whether the cartridge matches the accuracy of the war and the evasion of the enemy. For bullets that hit the enemy, calculate the total damage. Deal damage to the enemy.
- Take damage (interface method) — take away damage from the current health level.

8. Classes for warriors inherited from AbstractWarrior.

Make several classes of warriors. Divide them, for example, by seniority. An older warrior should have a higher level of health, greater accuracy, and better weapons. *Examples of classes: General, Captain, Soldier.*

9. The class of the team Team, which consists of warriors.

Warriors are recruited into the team according to probability: the higher the probability, the lower the rank. *Example: a general is created with a probability of 10%, otherwise a captain is created with a probability of 40%, otherwise a soldier is created.*

10. Sealed-BattleState class, which describes the current state of the battle.

There are four states:

- Progress — contains the necessary information for output to the console. For example: the total health of the team or the number of remaining warriors. Determine the necessary information yourself.
- The victory of the first team.
- The victory of the second team.
- Draw.

11. Battle Class Battle. This class is responsible for the logic of the battle.

Features:

- Team 1,
- Team 2,
- the battle is over. 

Methods:

- Get the battle status. 

  Determine the criteria for victory or defeat. For example:

  in each team, it is checked whether there are living warriors. If two teams have live warriors, the progress status is returned. Otherwise, it's a victory for one of the teams.

- Make an iteration of the battle.

  Define the rules for the iteration of the battle. For example:

  The warriors of the two teams are mixed up. Warriors from each team deal damage to each other in turn, if they are alive.

# Output
![](https://github.com/user-attachments/assets/4428384e-6669-4625-bb84-ae9cf0109bb9)

![](https://github.com/user-attachments/assets/ae79c7b5-0fa6-4448-9afd-a2dab174ce01)

![](https://github.com/user-attachments/assets/459f66de-9a88-40fe-8906-82ef661fe622)

![](https://github.com/user-attachments/assets/e7afdf8c-709c-48e0-bbde-c1754daca176)

![](https://github.com/user-attachments/assets/31d2e986-1f3c-491a-94f5-b705cc84a447)

![](https://github.com/user-attachments/assets/3c1b133a-8677-4620-b1bf-8523202e7a3b)

![](https://github.com/user-attachments/assets/51904404-6938-4e3d-aacb-097435c554c2)






