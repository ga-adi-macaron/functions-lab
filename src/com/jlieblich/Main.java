package com.jlieblich;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        stringLength("Hello world");
        System.out.println("The number " + 52 + " is even: ");
        System.out.println(isEven(52));
        userInput();
        typeQuit();
        System.out.println(fibonacci(10));
    }

    public static int stringLength(String str) {
        return str.length();
    }

    public static boolean isEven(int num) {
        return num%2 == 0;
    }

    public static void userInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string to echo");
        String input = s.nextLine();
        System.out.println(input);
    }

    public static void typeQuit() {
        Scanner s = new Scanner(System.in);
        System.out.println("Type \'quit\' to exit");
        String s1 = s.nextLine();
        if(s1.equalsIgnoreCase("quit")) {
            return;
        }
        typeQuit();
    }

    public static int fibonacci(int n) {
        if(n <= 2) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void longestString(String one, String two) {
        if(one.length() > two.length()) {
            System.out.println(one);
        } else if(one.length() == two.length()) {
            System.out.println("Invalid text");
        } else {
            System.out.println(two);
        }
    }
}
