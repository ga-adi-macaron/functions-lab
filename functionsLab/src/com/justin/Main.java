package com.justin;
import java.util.*;

public class Main {

    public static void main(String[] args) {



    }

    public static void stringLength(String input){
        System.out.println(input.length());
    }

    public static boolean isEven(int num){
        return ((num%2)==0);
    }

    public static void userInput (){
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Type Something");
        String input = keyboard.nextLine();
        System.out.println(input);


    }

   public static void typeQuit (){
       Scanner keyboard = new Scanner (System.in);
       System.out.println("Type something else");
       String input = keyboard.nextLine();
       if (input.equals("quit")) return;
       typeQuit();
   }

   public static void longestString (String word1, String word2){
       if (word1.length() > word2.length())
           System.out.println(word1);
       else
           System.out.println(word2);
   }
}
