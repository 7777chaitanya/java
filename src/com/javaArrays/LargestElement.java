package com.javaArrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] a = {8, 3, 5, 98, 11, 9};
        int max = a[0];

        for(int i=1;i<a.length;i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        System.out.println("The maximum element in the array is : "+max);
    }
}
