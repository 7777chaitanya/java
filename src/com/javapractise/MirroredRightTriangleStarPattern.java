package com.javapractise;

import java.util.Scanner;

public class MirroredRightTriangleStarPattern {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows that you want to print....");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for(int i = 1;i<=rows;i++)
        {
            for(int j = 1;j<=(rows-i);j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
