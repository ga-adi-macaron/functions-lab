package com.jlieblich;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        stringLength("Hello world");
        System.out.println("The number " + 52 + " is even: ");
        System.out.println(isEven(52));
        userInput();
        typeQuit();
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
}
