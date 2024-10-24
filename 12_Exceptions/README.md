# Objectives of the task
- Learn how to create your own exceptions.
- To consolidate the work with exceptions in practice.

# What needs to be done

You need to write an application that simulates the wheel sensor data. Car wheels need to be inflated strictly to a certain pressure. If the value is exceeded or underestimated, the program must throw and handle the appropriate exceptions.

We will consider the values from 1.6 to 2.5 atmospheres as normal pressure, at which the tire will not fly off the disc and the wheel will interact well with the road.

The pressure in the wheel cannot be negative (the tire does not hold a vacuum without pressure).

If the pressure in the wheel exceeds 10 atmospheres, it will explode. Thus, we can pump the wheel from 0 to 10 atmospheres, and we will consider values from 1.6 to 2.5 atmospheres as acceptable values for operation.

1. Create exception classes: 
- TooHighPressure (for too high pressure);
- TooLowPressure (for too low pressure);
- IncorrectPressure (for unacceptable pressure: negative or exceeding 10 atmospheres).

2. Create a wheel class.
- Features:
    - the current pressure.
- Functions:
    - inflate the wheel to a certain pressure (if the applied pressure is unacceptable, the function throws an appropriate exception, otherwise sets the value for pressure);
    - check the pressure level in the wheel (if the pressure does not correspond to normal, the function throws an exception).
3. Write a program for testing.
- Create a wheel.
- Try to set three different pressure values via the wheel pump function: permissible pressure, normal pressure, unacceptable pressure.
- Add exception handling. Depending on the type of error, output the result to the console: whether the wheel has been inflated and whether it can be operated.

Example:

*When pumping -5 atmospheres, the procedure failed.*

*When pumping 6 atmospheres, the procedure was successful. Operation is impossible — the pressure exceeds normal.*

*When pumping 2 atmospheres, the procedure was successful. Operation is possible.*

# Output
![](https://github.com/user-attachments/assets/78a0c805-d2f2-4877-88e0-0a3833fc78ac)
