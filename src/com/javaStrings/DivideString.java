package com.javaStrings;

import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        System.out.print("Enter the string that you want to divide...");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.print("Enter the number of parts that you want to divide the string into..");
        int parts=scanner.nextInt();
        if(input.length()%parts != 0)
        {
            System.out.println("Cannot divide the string into "+parts +" equal parts");
        }
        else
        {
            int index=0;
            System.out.println(parts+" equal parts of the string are,");
            for(int i=0;i<parts;i++)
            {
                for(int j=1;j<=input.length()/parts;j++)
                {
                    System.out.print(input.charAt(index));
                    index++;
                }
                System.out.println();
            }
        }
    }
}
