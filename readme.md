title | type | duration | creator
----- | ---- | -------- | -------
Functions and Scope | lab | 1:30 | James Davis (New York)


# ![](https://ga-dash.s3.amazonaws.com/production/assets/logo-9f88ae6c9c3871690e33280fcf557f33.png) Functions and Scope

## Introduction

> ***Note:*** _This can be a pair programming activity or done independently._

This lab provides an opportunity to practice creating functions!

## Exercise

#### Requirements

Please write code that implements various functions, following the requirements in the list below:


- Define a method `stringLength`, that accepts a `String` parameter, and prints out the length of the String.

- Define a method `isEven`, that takes an `int` parameter, and returns `true` if the number is even, `false` if it is not. Print this returned value to the command line. *Note how do we know a number is even?*

- Define a method `userInput`, asks the user to type something into the command line, uses the Scanner class we used during the lesson to take the `String` the user provides in the command line and prints it back to the command line.

- Define a method `typeQuit`, asks the user to type something into the command line, prints the `String`, then continues to ask the user to type something until the user types in `quit`. Use the Scanner class we used during the lesson, to take the `String` the user provides in the command line.
*hint: this requires recursion*

**Bonus**

- Define a method, `parameterCount`, that accepts an unknown number of `String` parameters, and prints out the the number of parameters.

- Define a method `longestString`, that accepts two `String` parameters of different length, and returns the `String` with the longest length. Print the returned value to the command line.

- Define a method `fibonacci`, that takes an `int` parameter, and prints out the fibonacci sequence up to that value.
*Note: Fibonacci sequence: given a number N, the fibonacci sequence equals the sum of (N-1) + (N-2)*
*hint: this requires recursion*

#### Starter Code

The code snippet below will be useful for the isEven.

```java
/**
     * Converts a string into an integer
     * @return An integer version of the string, or 0 if the string is not a number.
     */
private int convertToInteger(String numberString){
    int value = 0;

    if (!TextUtils.isEmpty(numberString)){
        try {
            value = Integer.parseInt(numberString);
        } catch (NumberFormatException ex){ }
    }

        return value;
}
```

#### Deliverable

An IntelliJ project containing the methods described above.

## Additional Resources:
- [Oracle Java Docs - Defining Methods](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
- [Oracle Java Docs - A Closer Look at the "Hello World!" Application](https://docs.oracle.com/javase/tutorial/getStarted/application/)
- [Princeton Java Cheat sheet](http://introcs.cs.princeton.edu/java/11cheatsheet/)
- [Java Modifier Types](http://www.tutorialspoint.com/java/java_modifier_types.htm)
- [Princeton Recursion](http://introcs.cs.princeton.edu/java/23recursion/)
