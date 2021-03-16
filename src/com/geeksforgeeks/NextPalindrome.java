package com.geeksforgeeks;

import java.util.Scanner;

public class NextPalindrome {
    public static void main(String[] args) {
        System.out.print("Enter the number....");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        while (true) {
            int c = Integer.parseInt(a);
            c++;
            a = String.valueOf(c);
            String b="";
            for (int i = a.length()-1; i >= 0; i--)
            {
                b+=a.charAt(i);
            }
            if(a.equals(b))
            {
                System.out.println("The next palindrome is : "+a);
                break;
            }

        }
    }
}

