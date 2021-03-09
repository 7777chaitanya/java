package com.javapractise;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number to check....");
        StringBuilder inputStringbuilder = new StringBuilder("");
        String inputString = scanner.next();
        inputStringbuilder.append(inputString);
        String reversed = inputStringbuilder.reverse().toString();

//        System.out.println(inputStringbuilder);
        if(inputString.equals(reversed))
        {
            System.out.println("The given number is a palindrome");
        }
        else {
            System.out.println("The given number is not a palindrome");
        }
    }
}
