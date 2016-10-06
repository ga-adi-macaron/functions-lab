package com.elysium;

public class Main {

    public static void main(String[] args) {

        /** Define a method stringLength, that accepts a String parameter, and prints out the length of the String.
         * Thank you for the the help on this, Charlie!
        */

        System.out.println(stringLength("blah blah blah"));
        System.out.println(stringLength("huh"));
    }

    public static int stringLength(String input) {

        return input.length();
    }

    /** Define a method isEven, that takes an int parameter, and returns true if the number is even, false if it is not.
     * Print this returned value to the command line. Note how do we know a number is even?
     *
     * Converts a string into an integer
     * @return An integer version of the string, or 0 if the string is not a number.
     */

    private int convertToInteger(String numberString){
        int value = 0;

        if (!TextUtils.isEmpty(numberString)){
            try {
                value = Integer.parseInt(numberString);
            } catch (NumberFormatException ex){ }
        }

        return value;

        /** I legitimately cannot figure this out... I've been attempting this since 8PM, and have had no luck :(
         *
         */
    }

}
