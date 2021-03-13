package com.javaStrings;

import java.util.Locale;
import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        System.out.print("Enter the string.....");
        Scanner scanner = new Scanner(System.in);
        String string=scanner.nextLine().toLowerCase().replaceAll("\\s", "");
        String vowels="aeiou";
        int vowelCounter=0;

        //iterating the input string which is converted to lowercase and the spaces are removed
        //input:HELLO SIR - result:hellosir
        for(int i=0;i<string.length();i++)
        {
            for(int j=0;j<vowels.length();j++)
            {
                if(string.charAt(i) == vowels.charAt(j))
                {
                    vowelCounter++;
                    break;
                }
            }
        }
        System.out.println("The number of vowels in the given string is     : "+vowelCounter);
        System.out.println("The number of consonants in the given string is : "+(string.length()-vowelCounter));


    }
}
