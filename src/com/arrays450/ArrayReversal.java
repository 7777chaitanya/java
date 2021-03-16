package com.arrays450;

import java.util.Arrays;

public class ArrayReversal {
    public static void print(int[] a)
    {
        System.out.print("{");
        for(int element:a)
        {
            System.out.print(element+", ");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int n=a.length;
        int l=0;
        int r=n-1;

        while(l<r)
        {
            int temp = a[l];
            a[l]=a[r];
            a[r]=temp;
            l=l+1;
            r=r-1;
        }
        print(a);
    }
}
