package com.geeksforgeeks;

import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows that you want to print.....");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for(int i=0;i<rows;i++)
        {
            for(int j=1;j<rows-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--)
            {
                System.out.print(j);
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
