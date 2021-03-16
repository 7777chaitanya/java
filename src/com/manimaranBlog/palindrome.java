package com.manimaranBlog;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        //Asking the user to enter the input
        System.out.print("Enter the string for which you want to check if it is a palindrome or not...");

        //using instance of Scanner class to receive the input
        Scanner scn = new Scanner(System.in);

        //storing the input that we received in a variable called 'input' of type String
        String input = scn.next();

        //initializing a empty string to store the reverse of the input
        String reverse ="";

        //using for loop to iterate from the reverse of the string and append each character to the 'reverse' string
        for(int i=input.length()-1;i>=0;i--)
        {
            reverse+=input.charAt(i);
        }

        //print statements to format our output
        System.out.println("--------------------------------------------");
        System.out.println("Input                |                Output");
        System.out.println("--------------------------------------------");

        //comparing 'input' with the 'reverse' string
        //using equals() method of the string class
        //equals() returns a boolean value(true or false)
        if(input.equals(reverse))
        {
            System.out.println(input+"                |               "+"Yes");
        }
        else
            System.out.println(input+"                  |              "+"No");
        System.out.println("---------------------------------------------");
    }
}
