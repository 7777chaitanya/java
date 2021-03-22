package com.arrays450;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class NegativeElementsToOneSide {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements that you want to hold in the integer array : ");
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        int[] arr = new int[n];
        int i=0;
        while(i<n){
            System.out.print("Enter the element at index "+i+" : ");

            arr[i]=scn.nextInt();
            i++;
        }
        int counter=0;
        for(int j=0;j<n-1;j++)
        {

            int flag = 0;
            for(int k=0;k<n-1;k++){

                if(arr[k]>0 && arr[k+1]<0){
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                    flag=1;
                }
            }
            if(flag == 0){
                break;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}

