package com.javaArrays;

public class MinimumElement {
    public static void main(String[] args) {
        int[] a = {8, 3, 5, 11, 9};
        int min = a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i] < min)
            {
                min = a[i];
            }
        }
        System.out.println("The minimum element is : "+min);
    }
}
