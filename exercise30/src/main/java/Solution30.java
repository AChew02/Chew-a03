/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Adrian Chew
 */

public class Solution30 {

    public static void main(String[] args) {
        Solution30 app = new Solution30();
        //Declare loop variables
        int i;
        int j;

        //Loop through rows
        for(i=1; i<=12; i++) {

            //loop through columns
            for(j=1; j<=12; j++) {
                //print i*J
                app.printFormattedNumber(i*j);
            }

            //print newline

        }
    }

    public void printFormattedNumber(int num) {
        //print num, right-justified, 5 character spaces
    }
}
