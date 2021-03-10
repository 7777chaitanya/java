package com.javapractise;

import java.util.Scanner;

public class PatternPrinting1 {
    public static void main(String[] args) {
        System.out.print("Enter the number of lines for which you want to print the pattern..");
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();

        for(int i = 0;i <= lines;i++) //This loop is used to iterate through the lines
        {
            for(int j = 1;j <= i;j++) //This loop is for printing the stars in each line
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
