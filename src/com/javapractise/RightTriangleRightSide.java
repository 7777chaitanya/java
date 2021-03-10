package com.javapractise;

import java.util.Scanner;

public class RightTriangleRightSide {
    public static void main(String[] args) {
        System.out.print("Enter the number of lines that you want to print...");
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        for(int i = 0; i<=lines;i++)
        {
            for(int j = 0; j<(lines-i);j++)
            {
                System.out.print("  ");
            }
            for(int j = 0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
