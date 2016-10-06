package nicky.shoeolive;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        fibonacciByValue(100000);
        fibonacciByIndex(20);

        stringLength("Hello nurse");
        stringLength("Milk steak with your finest jelly beans, raw");

        System.out.println(isEven(14));
        System.out.println(isEven(0));
        System.out.println(isEven(4746381));

        //userInput(); //These 2 functions conflict with one another
        typeQuit();
        parameterCount("Bananas", "Oranges", "Kumquats", "Apples", "Lemons", "Grapes");

        System.out.println(longestString("You bite your thumb at me?", "No, sir, I do not bite my thumb at you sir; But I bite my thumb sir."));
    }

    public static void stringLength(String str){

        System.out.println(str.length());
    }

    public static boolean isEven(int num){
        if (num%2 == 0){
            return true;
        } else {
            return false;
        }
    }
    public static void userInput(){
        System.out.println("Feel free to type anything");
        Scanner scanner = new Scanner(System.in);
        String userEntry = scanner.nextLine();
        System.out.println(userEntry);
    }

    public static void typeQuit(){
        System.out.println("You're standing in a dark room, " +
                "you see a dim light ahead of you." +
                "What action do you want to take?" +
                "Move forward, turn around, reach for light");
        Scanner takeInput = new Scanner(System.in);
        String userEntry = takeInput.nextLine();
        if (userEntry.toLowerCase().equals("move forward")){
            System.out.println("You move forward, but a mysterious force pushes you back");

        }else if (userEntry.toLowerCase().equals("turn around")){
            System.out.println("You turned around, but there's nothing but a wall behind you.");
        }else if (userEntry.toLowerCase().equals("reach for light")){
            System.out.println("You reach for the light, but it singes you as you get near." +
                    "You probably should just type \"quit\"");
        }else if (userEntry.toLowerCase().equals("quit")){
            return;
        }else {
            System.out.println("That's not a valid entry, stop fooling around.");
        }
        typeQuit();
    }

    public static void parameterCount(String... strings){
        int count =0;
        for (String s:strings) {
            count++;
        }
        System.out.println(count);
    }

    public static String longestString(String firstStr, String secondStr){
        if (firstStr.length()>secondStr.length()){
            return firstStr;
        }else if (firstStr.length()<secondStr.length()){
            return secondStr;
        }else if (firstStr.length()==secondStr.length()){
            String message = firstStr + "is the same length as "+ secondStr;
            return message;
        } else {
            return "Something went wrong";
        }
    }
    public static int[] recurse(int x, int y){
        int[] values= new int[2];
        values[0]= y;
        values[1]=x+y;
        return values;
    }
    public static void fibonacciByValue (int ceiling){
        int x = 1;
        int y = 1;
        int[] values = new int[2];
        System.out.println(x);
        System.out.println(y);
        int z = x+y;
        values[0]= y;
        values[1]=z;
        while (values[1]<ceiling){
            System.out.println(values[1]);
            values = recurse(values[0],values[1]);
        }

    }
    public static void fibonacciByIndex(int index){
        int n1=0;
        int n2=1;
        int n3;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 2; i<index; i++){
            n3 = n1+n2;
            System.out.println(n3);
            n1= n2;
            n2 = n3;
        }
    }
}
