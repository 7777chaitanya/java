package com.searchandsort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {16, 14, 1, 5, 6, 8, 2};

        //here n = 5
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            int flag = 0;
            for(int j=0;j<n-1-i;j++)
            {
                if (arr[j] > arr[j+1])
                {
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
                  flag = 1;
                }
            }
            if(flag == 0)
            {
                break;
            }
        }
        System.out.println("The sorted array is : "+ Arrays.toString(arr));
    }
}
