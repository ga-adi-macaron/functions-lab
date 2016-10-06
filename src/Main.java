import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Scott Lindley on 10/4/2016.
 */
public class Main {
    public static void main(String[] args) {
        stringLength("Hello!");
        isEven(45);
        fibonacci(34);
    }

    public static void stringLength(String string){
        System.out.println(string.length());
    }

    public static boolean isEven(int number){
        if(number%2==0){
            System.out.println(true);
            return true;
        }else{
            System.out.println(false);
            return false;
        }
    }

    public static void userInput(){
        System.out.println("Type something. Anything!");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
    }

    public static void typeQuit(){
        System.out.println("Type something. If you're no longer having fun," +
                " type 'quit'.");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        if(!userInput.toLowerCase().equals("quit")){
            System.out.println(userInput);
            typeQuit();
        }else{
            System.out.println("thanks for playing!");
        }
    }

    public static void parameterCount(ArrayList<String> stringList){
        System.out.println(stringList.size());
    }

    public static String longestString(String string1, String string2){
        if(string1.length()>string2.length()){
            System.out.println(string1);
            return string1;
        }else{
            System.out.println(string2);
            return string2;
        }
    }

    public static void fibonacci(int number) {
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);
        while(sequence.get(sequence.size()-1)<number){
            sequence.add(sequence.get(sequence.size()-1)+sequence.get(sequence.size()-2));
        }
        System.out.println(sequence);
    }

}
