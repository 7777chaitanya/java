package com.javaStrings;


import java.util.Scanner;

public class dummy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the input string");
            String str = scn.next();
            char[] c = str.toCharArray();
            if (c.length % 2 != 0) {
                continue;
            }
            int flag=0;
            for(int i=0;i<c.length;i+=2)
            {

                if(!((c[i] >= (int)'a') && (c[i] <= (int)'z')))
                    flag =1;

            }
            if(flag ==1){
                System.out.println("skipping");
                continue;
            }
            String result = "";
            for (int i = 0; i < c.length; i += 2) {
                int count = i+1;
                int repeater = Character.getNumericValue(c[count]);

                for(int j=1;j<=repeater;j++){
                    result+=Character.toString(c[i]);
                }
            }
            System.out.println(result);
            }
        }
    }






