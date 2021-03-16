package com.javaStrings;

import java.util.Scanner;

public class AllSubsets {
    public static void main(String[] args) {
        System.out.print("Enter the string whose subsets you want to find....");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        for(int j=1;j<=input.length();j++)
        {
            System.out.println("-----------Substrings with "+j+" letters-------------- ");

            for (int i = 0; i <= input.length()-j; i++) {
                System.out.println(input.substring(i, i + j));
            }
            System.out.println();
        }

    }
}
