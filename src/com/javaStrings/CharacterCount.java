package com.javaStrings;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        System.out.print("Enter the string..........");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("The number of characters in the given string is : "+count);
    }
}
