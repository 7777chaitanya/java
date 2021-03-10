package com.javapractise;

import java.util.Scanner;

public class PatternPrintingDiamond {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows that you want to print....");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        //to print the upper triangle including the base
        for(int i=1; i<=rows; i++)
        {
            for(int j=1;j<=(rows-i);j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=((i*2)-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //to print the inverted triangle on the lower half of the diamond
        for(int i = rows-1;i>=1;i--)
        {
            for(int j = 1;j<=rows-i;j++)
            {
                System.out.print(" ");
            }
            for(int j= ((i*2)-1); j>=1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
