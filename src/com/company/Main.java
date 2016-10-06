package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(stringLength("GA_NYC_SERKANBAL"));
        System.out.println(isEven(10));
        System.out.println("Type something; I will mirror it!");
        userInput();
        typeQuit();
    }

    public static int stringLength(String abc) {
        int length = abc.length();
        return length;
    }

    public static boolean isEven(int num0) {
        int remaining = num0 % 2;
        boolean even;
        if (remaining == 1) { even = false;
        } else { even = true;
        }
        return even;

    }

    public static void userInput() {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        System.out.println(userInput);
    }

    public static void typeQuit() {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        if (userInput.equals("quit")) { return;
        } else { System.out.println("Type quit if you want to quit!");
        typeQuit();
        }
    }
}