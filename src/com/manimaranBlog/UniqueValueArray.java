package com.manimaranBlog;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueValueArray {
    public static void main(String[] args) {
        //asking the size of the array to the user
        System.out.print("Please Enter the size of the array..");
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();

        //initializing the array of size asked by the user
        int[] arr = new int[size];

        //getting elements of array one by one
        System.out.println("Please enter the elements of the array one by one...");
        int i =0;
        while(i<size){
            System.out.print("Enter the element at index "+i+" : ");
            arr[i] = scn.nextInt();
            i++;
        }

        //initializing array called 'unique'
        int[] unique = new int[size];

        //to keep track of the index of the uniqe array
        int uniqueIndex = 0;
        int count;

        //iterating input arr
        for(int each: arr) {
            count = 0;
            int flag = 0;

            //checking if the element exists in the unique array
            for (int j = 0; j < unique.length; j++) {
                if (each == unique[j]) {
                    flag = 1;
                    break;
                }
            }


            //if the element does not exist in the unique array, count the frequeny of the element
            if (flag == 0) {
                for (int k = 0; k < size; k++) {
                    if (each == arr[k]) {
                        count++;
                    }
                }

                //adding the element to the unique array
                unique[uniqueIndex] = each;
                uniqueIndex++;
            }
        }

        //The 'unique' array is initialized with size = size of input array
        //The unused spaces in the 'unique' will contain value as 0
        //using 'indexCounter' to make note of the index from which the zeros are starting
        int indexCounter = 0;
        while(indexCounter<size)
        {
            if(unique[indexCounter]!=0)
            {
                indexCounter++;
            }
            else
                break;
        }

        //initializing unique2 to with size =  indexCounter
        int[] unique2 = new int[indexCounter];
        //copying non-zero elements from unique1 to unique2
        for(int j=0;j<indexCounter;j++)
        {
            unique2[j] = unique[j];
        }
        System.out.println(Arrays.toString(unique2));
    }
}
