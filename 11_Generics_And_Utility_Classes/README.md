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
