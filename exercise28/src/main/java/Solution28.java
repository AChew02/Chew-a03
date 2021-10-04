/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Adrian Chew
 */

import java.util.Scanner;

public class Solution28 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution28 app = new Solution28();
        //Declare sum, initialize to 0
        int sum = 0;

        //Declare output string
        String output;

        //Loop 5 times to get input
        for(int i=0; i<5; i++) {
            //Get input from user, adding it to the sum
            sum += app.getIntegerFromUser("Enter a number: ");
        }

        //Set output string based on sum
        output = app.setOutput(sum);

        //print output
        app.printOutput(output);
    }

    private int getIntegerFromUser(String prompt) {
        //Print prompt
        System.out.println(prompt);

        //Return next int
        return in.nextInt();
    }

    public String setOutput(int sum) {
        //return output message concatenated with sum
        return "The total is " + sum + ".";
    }

    private void printOutput(String output) {
        //print output string
        System.out.println(output);
    }
}
