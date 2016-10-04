package com.korbkenny;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        stringLength("Howdy yall");
        stringLength("Sssup?");
        isEven(7);
        isEven(14);
        userInput();
        typeQuit();

        System.out.println("Hey, I'm Kenny. Thanks for using my program. Don't forget to hit like and subscribe!");
    }

    public static void stringLength(String datString){
        System.out.println(datString.length());
    }

    public static void isEven(int num1){
        if(num1 % 2 == 1) {
            System.out.println("is " + num1 + " even? No, in fact, it's false that it is!");
        } else {System.out.println(num1 + " is even. Yes, that is quite true...");
        }
    }

    public static void userInput(){
        System.out.println("Now type something and I'll print it.");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        System.out.println(userInput);
    }

    public static void typeQuit(){
        System.out.println("Again, type something. Or just quit, I don't care:");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        if(userInput.equals("quit")){
            System.out.println(userInput);
            return;
        }
        else {
            System.out.println(userInput);
        }

        typeQuit();
    }



}


