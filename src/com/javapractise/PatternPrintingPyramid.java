package com.javapractise;

import java.util.Scanner;

public class PatternPrintingPyramid {
    public static void main(String[] args) {
        System.out.print("Enter the number of lines to print.......");
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();

        for(int i = 1; i<=lines; i++)
        {
            for(int j = 1; j<=(lines-i); j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
