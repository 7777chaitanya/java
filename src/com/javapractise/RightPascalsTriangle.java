package com.javapractise;

import java.util.Scanner;

public class RightPascalsTriangle {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows....");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for(int i =1;i<=rows;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = rows-1;i>=1;i--)
        {
            for(int j = i;j>=1;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
