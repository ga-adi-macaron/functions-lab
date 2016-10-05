package com.joelimyx;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isEven(6));
        //userInput();
        //typeQuit();
       // System.out.println(longestString("first", "second"));
        parameterCount("apple","orange","fint");
        fibonacci(10);
    }

    public static void stringLength(String phrase) {
        System.out.println(phrase.length());
    }

    public static boolean isEven(int num1) {
        return ((num1 % 2) == 0);
    }

    public static void userInput() {
        System.out.println("Please Enter a phrase to be print out: ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        System.out.println("This is what you entered: " + userInput);
    }

    public static void typeQuit() {
        System.out.println("This prompt won't end until you enter 'quit': ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        if (userInput.equalsIgnoreCase("quit")) {
            return;
        }
        typeQuit();
    }
    public static void parameterCount(String... list) {
        int count = 0;
        for (String arg : list)
            count++;
        System.out.println(count);
    }

    public static String longestString(String phrase1, String phrase2) {
        if (phrase1.length() < phrase2.length()) {
            return phrase2;
        } else {
            return phrase1;
        }
    }

    public static void fibonacci(int limit) {
        fibonacci(0, 1, limit - 2);
    }
    //fib recursive
    public static void fibonacci(int num1, int num2, int limit){
        System.out.print(num1+ " "+num2+ " ");
        if(limit<=1)
            return;
        int latest = num2+num1;
        fibonacci(latest, latest+num2, limit-2);
    }
}
