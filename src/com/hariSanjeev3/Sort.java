package com.hariSanjeev3;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        String[] a = {"1", "14", "100", "3", "38", "425", "6", "82"};

        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(Integer.parseInt(a[j]) > Integer.parseInt(a[j+1]))
                {
                    String temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
