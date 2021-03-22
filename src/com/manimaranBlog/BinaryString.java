package com.manimaranBlog;

import java.util.Scanner;

public class BinaryString {
    public static void main(String[] args) {
        System.out.println("Enter the binary string");
        Scanner scn = new Scanner(System.in);
        String input= scn.nextLine();
        System.out.println(input);
        String[] arr = {"01", "10"};
        int zeroOneCounter = 0;
        int oneZeroCounter = 0;
        for(int i=0;i<input.length();i+=2){

                if(input.substring(i,i+2).equals(arr[0])) {
                    zeroOneCounter++;
                }
                if(input.substring(i,i+2).equals(arr[1])) {
                    oneZeroCounter++;
                }

        }
        int flips=0;
        if(zeroOneCounter<oneZeroCounter){
            for(int i=0;i<input.length();i++){
                if(i%2 ==0 && input.charAt(i)!='1'){
                    flips++;
                }
                if(i%2 !=0 && input.charAt(i)!='0'){
                    flips++;
                }
            }
        }

        if(zeroOneCounter>oneZeroCounter){
            for(int i=0;i<input.length();i++){
                if((i%2 ==0) && (input.charAt(i)!='0')){
                    flips++;
                }
                if((i%2 !=0) && (input.charAt(i)!='1')){
                    flips++;
                }
            }
        }
        System.out.println("The minimum number of flips required is : "+flips);
    }
}

