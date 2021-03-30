package com.hariSanjeev3;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String input = sc.next();
        char[] arr = input.toCharArray();
        int len = input.length();

        String[] ones = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] tens = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen","Seventeen", "Eighteen", "Nineteen"};
        String[] tens2 = {"Ten","Twenty","Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety", "Hundred"};
        String output="";
        if(len == 3){
            output += Character.toString(arr[0])+ tens2[9] +"and" + inp

        }


    }
}
