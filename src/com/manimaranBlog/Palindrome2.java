package com.manimaranBlog;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
public class Palindrome2 {
    public static void main(String[] args) {
        //getting the input string to check from the user and storing it in 'string' variable
        System.out.print("Enter the string....");
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();

        //converting the input string to character array
        char[] inputarr=input.toCharArray();
        //sorting the characters in the string
        //Bubble sort
        for(int i=0;i<inputarr.length-1;i++)
        {
            for(int j=0;j<inputarr.length-1-i;j++)
            {
                if(inputarr[j]>inputarr[j+1])
                {
                    char temp = inputarr[j];
                    inputarr[j] = inputarr[j+1];
                    inputarr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(inputarr));
        //logic to check if the input string can form a palindrome
        int counter=0,i=0;

        while(i<inputarr.length)
        {
            if(i!=inputarr.length-1) {
                if (inputarr[i] == inputarr[i + 1]) {
                    i += 2;
                } else {
                    i++;
                    counter++;
                }
            }
            else {
                i++;
                counter++;
            }
        }

        //final print statements after checking passing the array through the logic
        if(counter == 1 && i ==inputarr.length)
        {
            System.out.println("The given string can form a palindrome");
        }
        else if(counter == 0 && i==inputarr.length)
        {
            System.out.println("The given string can form a palindrome");
        }
        else
        {
            System.out.println("The given string cannot form a palindrome");
        }
    }
}
