package com.javapractise;

import java.util.Scanner;

public class DownwardTriangleStarPattern {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows.....");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for(int i=rows;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
