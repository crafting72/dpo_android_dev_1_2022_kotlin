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
