/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Adrian Chew
 */


public class Solution38 {

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
        output = app.setOutput();

        //print output

    }

    private String getStringFromUser() {
        //print user prompt
        //return string input
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
        //declare temp integer array
        int[] temp;

        //loop through length of string
        for(int i=0; i<(in.length())/2; i++){
            //parse int from string into temp array

        }
        //return temp array
        return temp;
    }

    public int[] getEvenInts(int[] ints) {
        //declare temp integer array
        int[] temp;

        //declare array position counter, initialize to 0;
        int arrayPos = 0;

        //loop through inta array
        for(int i=0; i<ints.length; i++) {
            //check if integer is even
            if(ints[i]%2 == 0) {
                //current int to temp array
                //increment arrayPos
            }
        }
        //return temp array
        return temp;
    }

    public String arrayToString(int[] evens) {
        //return string from converted array
    }

    public String setOutput(String even) {
        //return output string with evens added
    }
}
