# The goals of practical work
- To consolidate the work with pictures in practice.
- Create paused functions.
- Learn how to start and interrupt the execution of coroutines.

# What needs to be done

Write a program that calculates the nth number from the Fibonacci series. You have already faced the problem of Fibonacci numbers when studying cycles. Now you need to modify the existing code or write the program again using coroutine.

If you encounter difficulties, contact your supervisor for help or read the "Tips and Recommendations" section.

The algorithm for completing the task:

1. Create a Fibonacci singleton object. 

2. In this object, create the suspend take function. The function takes a number as input — a number in the Fibonacci sequence — and returns a calculated number of the BigInteger type. To create a BigInteger number, use the toBigInteger extension function.

3. Run two or more coroutines in the main function. Use the unblocking function and the launch builder to do this. Inside each painting, call the take function and output the result to the console.

4. Calculate several Fibonacci numbers in ascending order, then in descending order. Run the program several times and analyze the order of operation of the coroutine.

*For example:*

*Ascending order:*

![](https://github.com/user-attachments/assets/00ad1c5d-e48e-4fcc-8ca8-dc46ff713ddc)

5. Make the suspend take function cancellable. Use the yield function for this. Or the currentCoroutineContext function and its isActive extension.

*For example:*

![](https://github.com/user-attachments/assets/7d113e42-05f6-43e8-97aa-6f0797a9e550)

If necessary, the execution of the function should be interrupted. Determine the breakpoints yourself, based on the implementation of your function. 

6. Run the program a few more times and re-analyze the order of operation of the coroutines.

7. Cancel the take function if some time is exceeded. Use the withTimeout function to do this. 

For example:

![](https://github.com/user-attachments/assets/f08b1b79-385c-4e92-83d1-4963c7adedd5)

runs a block of code for execution and interrupts its execution when it exceeds 3 seconds. 

You can read more about timeout interrupts here. 

The numbers in the loop are calculated quickly, therefore, in order for the timeout cancellation to be noticeable, it is necessary to calculate the numbers from the Fibonacci sequence with a fairly large ordinal number. Using a loop instead of recursion and BigInteger instead of Long will get rid of data type overflow and stack overflow.

8. When canceling by timeout, a TimeoutCancellationException is thrown. Handle this exception and output a message to the console about exceeding the calculation time.

9. Run another coroutine, which will be an indicator of calculations and display the points in the console. This coroutine should work as long as all your Fibonacci numbers are being calculated.

* **Optional**: Ensure that the output of the calculated values occurs after all the numbers have been calculated. Thus, the numbers will be calculated in parallel, but the progress indicator (dots) will not be interrupted by messages about the calculated number.

# Output 


https://github.com/user-attachments/assets/591154f6-6526-4441-800d-ecdb24adabcb

