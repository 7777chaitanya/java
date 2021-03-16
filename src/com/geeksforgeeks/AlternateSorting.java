package com.geeksforgeeks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AlternateSorting {
    public static void main(String[] args) {
        int[] given = {1,2,3,4,5,6,7};
        int length=given.length;
        int[]  result = new int[length];

        for(int i=0;i<length/2;i++)
        {
            result[i] = given[length-i-1];
            result[length-1-i] = given[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
