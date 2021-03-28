package com.geeksforgeeks;

import java.util.Locale;

public class a1b10 {
    public static void main(String[] args) {
        String str = "a1b10";
        String result = "";

        //iterate str
        for (int i = 0; i < str.length(); i++) {


            // check if the character lies in alphabet range
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {


                //check current index+2 < length of str
                if ((i + 2) < str.length()) {


                    //check if the character after 2 places is an integer
                    if ((0 <= (Integer.parseInt(String.valueOf(str.charAt(i+2))))) && ((Integer.parseInt(String.valueOf(str.charAt(i+2))))<= 9)) {


                        //then iterate the loop till the number at ((index+1)+(index+2)) and append charAt(index) to result
                        for (int j = 0; j < (Integer.parseInt(String.valueOf(str.charAt(i + 1)))*10) + Integer.parseInt(String.valueOf(str.charAt(i + 2)));j++) {
                            result += str.charAt(i);
                        }
                    }

                    //else then iterate the loop till the number at ((index+1) and append charAt(index) to result
                    else {
                        for (int j = 0; j < Integer.parseInt(String.valueOf(str.charAt(i + 1))); j++)
                        {
                            result += str.charAt(i);
                        }
                    }

                    System.out.println(result);
                }
            }
        }
    }
}
