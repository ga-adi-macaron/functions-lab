package ly.generalassemb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Test stringLength()
        stringLength("hello world!");
        stringLength("this is a lab for ADI Macaron");
        stringLength("");

        // Test isEven() - get input from user, convert it to an int, send the int to isEven(), print the result
        System.out.println("Enter a number & I'll tell you if it's even");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int userInputAsInt = convertToInteger(userInput);
        System.out.println(isEven(userInputAsInt));

        // Test userInput()
        userInput();

        // Test typeQuit()
        typeQuit();

        // Test parameterCount()
        parameterCount("hello");
        parameterCount("abc", "def");
        parameterCount("a", "b", "c", "d", "e", "f");
        parameterCount();

        // Test longestString()
        System.out.println(longestString("first", "second"));
        System.out.println(longestString("abc", ""));
        System.out.println(longestString("sdfhglsu", "adlfkugherl"));

        // Test fibonacci()
        System.out.println("Testing fibonacci...");
        fibonacci(15);
    }

    /**
     * Print the length of a String to the command line.
     * @param inputString is the String whose length will be printed.
     */
    public static void stringLength(String inputString) {
        System.out.println(inputString.length());
    }

    /**
     * Check whether an int is even.
     * @param number is the int to be checked.
     * @return true if number is even, else false.
     */
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }

        // Here's another way to do the it in just one line:
        //return (number % 2 == 0);
    }

    /**
     * Helper method: Converts a string into an integer.
     * @return An integer version of the string, or 0 if the string is not a number.
     */
    private static int convertToInteger(String numberString){
        int value = 0;

        // Disregard the TextUtils class mentioned in the instructions for now;
        // That is an Android-specific library that we can use later in Android Studio.
        if (!numberString.isEmpty()) {
            try {
                value = Integer.parseInt(numberString);
            } catch (NumberFormatException ex){ }
        }

        return value;
    }

    /**
     * Ask the user to type something, then print whatever they type back to the command line.
     */
    public static void userInput() {
        // Prompt the user
        System.out.println("Type something and I'll repeat it");

        // Get their input
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        // Print it
        System.out.println(userInput);
    }

    /**
     * Ask the user to type something; if they type "quit" then stop, otherwise repeat back anything they type
     * and keep requesting more input over and over until they type "quit".
     */
    public static void typeQuit() {
        // Prompt the user
        System.out.println("Type something and I'll repeat it. Type \"quit\" when you're done.");

        // Get their input
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        // Check if the user typed "quit"
        // If we convert to lower case before checking, we can accept "quit", "Quit", "QUIT", "QuIt", etc.
        if (userInput.toLowerCase().equals("quit")) {
            System.out.println("bye bye");
        }
        else {
            System.out.println(userInput);

            // Start the process over by making a RECURSIVE call, i.e. the method calls itself
            typeQuit();
        }
    }

    /**
     * Count the number if arguments provided and print that number to the command line.
     * @param inputStrings is an indeterminate quantity of inputs of type String.
     */
    public static void parameterCount(String... inputStrings) {
        System.out.println("You provided " + inputStrings.length + " parameters");
    }

    /**
     * Take two input Strings and return whichever is longer.
     * @param first input String
     * @param second input String
     * @return first if it is longer than second, else second
     */
    public static String longestString(String first, String second) {
        if (first.length() > second.length()) {
            return first;
        }
        else {
            return second;
        }
    }

    /**
     * Print the fibonacci sequence up to the specified position.
     * @param n is the position in the sequence to be reached.
     */
    public static void fibonacci(int n) {
        if (n < 0) {
            System.out.println("n must be >= 0");
            return;
        }

        for (int i = 0; i <= n; i++) {
            System.out.println(fibonacciHelper(i));
        }
    }

    /**
     * Calculate the value at the nth position of the fibonacci sequence.
     * @param n is the position to calculate.
     * @return the value of the sequence at position n.
     */
    public static int fibonacciHelper(int n) {
        if (n < 2) {
            return n;
        }
        else {
            return fibonacciHelper(n - 1) + fibonacciHelper(n - 2);
        }
    }
}
