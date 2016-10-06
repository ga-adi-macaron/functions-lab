package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        stringLength("helloworld");
        System.out.println(isEven(9));
        userInput();
        typeQuit();
    }

    public static void stringLength(String str){
        System.out.println(str.length());
    }

    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void userInput(){
        Scanner input = new Scanner(System.in);
        String repeat = input.nextLine();
        System.out.println(repeat);
    }

    public static void typeQuit(){
        Scanner input = new Scanner(System.in);
        String exit = input.nextLine();
        System.out.println(exit);

        if(exit.equals("quit")){
            return;
        } else {
            typeQuit();
        }
    }
}