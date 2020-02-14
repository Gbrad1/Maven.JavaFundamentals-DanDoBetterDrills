package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment) {
        return firstSegment += secondSegment;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment) {
        String string = firstSegment + secondSegment;
        return string;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input) {
        return input.substring(0, 3);
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        return input.substring(input.length() -3);
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        return (inputValue == comparableValue);
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        int length = inputValue.length();
        //int middle = length / 2;
        if (length % 2 == 0) {
            return inputValue.charAt((length / 2) - 1);
        } else {
            return inputValue.charAt(length / 2);
        }
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        /*split allows us to create an array of Strings by taking the initial string and
        splitting anything with a space between it.*/
        return spaceDelimitedString.split(" ")[0];
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        return spaceDelimitedString.split(" ")[1];
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse) {
        //We created a new array of type char to put each letter from the strinToReverse.
        char[] reversedString = stringToReverse.toCharArray();
        //index and end created to control the while loop.
        int index = 0;
        int end = reversedString.length-1;
        //temporary does what it states. I am storing the current character here to move
        //to a new string.
        char temporary;
        //using sout to check the reversedString
        System.out.println(reversedString);
        while (end > index) {
            //temporary holds the
            temporary = reversedString[index];
            //setting the last index of reversedString to the first position of our new array.
            reversedString[index] = reversedString[end];
            //sets the index of end to temporary or a character in this case.
            reversedString[end] = temporary;
            end--;
            index++;
        }
        return new String(reversedString);
    }
}
