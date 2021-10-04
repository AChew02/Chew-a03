/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Adrian Chew
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution38 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution38 app = new Solution38();
        //declare string input
        String input;

        //declare even string output
        String evenOutput;

        //declare output string
        String output;

        //get input from user
        input = app.getStringFromUser();

        //filter the even numbers into new string
        evenOutput = app.filterEvenNumbers(input);

        //set output
        output = app.setOutput(evenOutput);

        //print output
        System.out.println(output);
    }

    private String getStringFromUser() {
        //print user prompt
        System.out.println("Enter a list of numbers, separated by spaces: ");

        //return string input
        return in.nextLine();
    }

    public String filterEvenNumbers(String input) {
        //declare input integer array
        int[] intInput;

        //declare even integer array
        int[] evenInt;

        //convert string to integer array
        intInput = stringToIntArray(input);

        //sort even integers out
        evenInt = getEvenInts(intInput);

        //convert even array to string and return result
        return arrayToString(evenInt);
    }

    public int[] stringToIntArray(String in) {
        //declare string array
        String[] splitString = in.split(" ");

        //declare temp integer array
        int[] temp = new int[splitString.length];

        //loop through length of splitString
        for(int i=0; i<splitString.length; i++){

            //parse int from string into temp array
            temp[i] = Integer.parseInt(splitString[i]);
        }
        //return temp array
        return temp;
    }

    public int[] getEvenInts(int[] ints) {
        //declare temp integer array
        int[] temp = new int[countEvens(ints)];

        //declare array position counter, initialize to 0;
        int arrayPos = 0;

        //loop through ints array
        for(int i=0; i<ints.length; i++) {

            //check if integer is even
            if(ints[i]%2 == 0) {

                //current int to temp array
                temp[arrayPos] = ints[i];

                //increment arrayPos
                arrayPos++;
            }
        }
        //return temp array
        return temp;
    }

    public int countEvens(int[] ints) {
        //declare counter
        int evens = 0;

        //loop through ints array
        for(int i=0; i<ints.length; i++) {

            //check if integer is even
            if(ints[i]%2 == 0) {

                //increment counter
                evens++;
            }
        }

        //return counter
        return evens;
    }

    public String arrayToString(int[] evens) {
        //return string from converted array
        return Arrays.stream(evens)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
    }

    public String setOutput(String even) {
        //return output string with evens added
        return "The even numbers are " + even + ".";
    }
}
