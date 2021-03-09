package com.javapractise;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)
    {
        System.out.print("Enter the number for which you want to calculate the factorial...");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = n;
        int fact = 1;
        while(temp != 0)
        {
            fact = temp * fact;
            temp--;
        }
        System.out.println(fact);
        System.out.println("The factorial of "+n +" is "+fact);
    }
}
