package com.javaArrays;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] arr =  {5, 2, 8, 7, 1};
        int n=arr.length;

        //using bubble sort
        //outer for loop - passes
        //inner for loop - comparing adjacent elements

        for(int i=0;i<n;i++)
        {
            int flag=0;
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;

                }
            }
            if(flag!=1)
            {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
