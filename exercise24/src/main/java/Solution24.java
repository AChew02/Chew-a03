/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Adrian Chew
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {

    private static final Scanner in = new Scanner(System.in);

    public String getStringFromUser(String prompt) {
        System.out.println(prompt);
        return in.nextLine();
    }

    public void printOutput(String output) {
        System.out.println(output);
    }

    public String sortString(String sort) {
        // 'toSort[]' = string.toCharArray(
        char[] toSort = sort.toCharArray();

        // Arrays.sort('toSort')
        Arrays.sort(toSort);

        // 'sortedString1' = String('toSort')
        return new String(toSort);
    }

    public boolean compareStringLength(String string1, String string2) {
        // 'stringLen1' = string1.length()
        int stringLength1 = string1.length();

        // 'stringLen2' = string2.length()
        int stringLength2 = string2.length();

        // if(stringLen1 != stringLen2)
        //    'anagram' = false
        // else
        //    'anagram' = true
        return stringLength1 == stringLength2;
    }

    public boolean isAnagram(String string1, String string2) {
        if(compareStringLength(string1, string2)) {
            String sortedString1 = sortString(string1);
            String sortedString2 = sortString(string2);

            // 'anagram' = sortedSting1.equals('sortedString2')
            return sortedString1.equals(sortedString2);
        }
        return false;
    }

    public String setOutput(boolean anagram, String string1, String string2) {
        // if('anagram')
        if(anagram)
            // output = "/"'string1'/" and /"'string2'/" are anagrams."
            return "\"" + string1 + "\" and \"" + string2 + "\" are anagrams.";
        // else
        // output = "/"'string1'/" and /"'string2'/" are not anagrams."
        return "\"" + string1 + "\" and \"" + string2 + "\" are not anagrams.";
    }

    public static void main(String[] args) {
        Solution24 app = new Solution24();

        // print("Enter two strings and I'll tell you if they are anagrams:")
        app.printOutput("Enter two strings and I'll tell you if they are anagrams:");

        // print("Enter the first string: ")
        // 'string1' = get input from user
        String string1 = app.getStringFromUser("Enter the first string: ");

        // print("Enter the second string: ")
        // 'string2' = get input from user
        String string2 = app.getStringFromUser("Enter the second string: ");

        boolean anagram = app.isAnagram(string1, string2);

        String output = app.setOutput(anagram, string1, string2);

        // print('output')
        app.printOutput(output);
    }
}
