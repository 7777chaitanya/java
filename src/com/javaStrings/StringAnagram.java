package com.javaStrings;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        //instantiating the scanner class to get input from the user
        Scanner scanner = new Scanner(System.in);

        //Asking the user to enter the first string
        System.out.print("Please enter string1 : ");
        String string1=scanner.next().toLowerCase();
        System.out.println();

        //Asking the user to enter the second string
        System.out.print("Please enter string2 : ");
        String string2=scanner.next().toLowerCase();
        System.out.println();

        //Logic to check Anagram
        if(string1.length() != string2.length())
        {
            System.out.println("Not Anagram");
        }
        else {
            char[] string1Array = string1.toCharArray();
            char[] string2Array = string2.toCharArray();
            Arrays.sort(string1Array);
            Arrays.sort(string2Array);
            if(Arrays.equals(string1Array,string2Array) == true)
            {
                System.out.println("The given strings are Anagram");
            }
        }
    }
}
