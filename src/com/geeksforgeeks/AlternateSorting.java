package com.geeksforgeeks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AlternateSorting {
    public static void main(String[] args) {
        int[] input = {13,2, 4,15,12,10,5};
        int n = input.length;

        for(int i=0;i<(n/2);i++)
        {
            for(int j=0;j<n-1;j+=2)
            {
                if(input[j] < input[j+2])
                {
                    int temp=input[j];
                    input[j] = input[j+2];
                    input[j+2] = temp;
                }
            }

            for(int j=1;j<n-2;j+=2)
            {
                if(input[j] > input[j+2])
                {
                    int temp=input[j];
                    input[j] = input[j+2];
                    input[j+2] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(input));


    }
}
