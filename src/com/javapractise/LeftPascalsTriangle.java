package com.javapractise;

import java.util.Scanner;

public class LeftPascalsTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows...........");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for(int i = 1;i<=rows;i++)
        {
            for(int j=1;j<=rows-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<rows;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=rows-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
