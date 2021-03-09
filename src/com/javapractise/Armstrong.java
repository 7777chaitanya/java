package com.javapractise;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Armstrong {
    public static void main(String[] args)
    {
        System.out.println("Enter the number for which you want to check if the number is palindrome");
        Scanner scanner = new Scanner(System.in);
        String inputNumber = scanner.nextLine();
        char[] inputArray = inputNumber.toCharArray();

        int result = 0;

        for(int i =0; i < inputArray.length; i++)
        {
            result += pow(Integer.parseInt(String.valueOf(inputArray[i])),3);
        }
        if(result == Integer.parseInt(inputNumber))
        {
            System.out.println("The given number is an Armstrong number");
        }
        else
        {
            System.out.println("The given number is not an Armstrong number");
        }
    }
}
