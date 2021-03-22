package com.hariSanjeev;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 5, 6, 7, 9, 10, 13};
        int[] array2 = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15};

        //create new array with size equal to sum of both array1 and array2
        int[] result = new int[array1.length+array2.length];
        int index=0;
        //iterate first array and add every element to the new array
        for(int i=0;i<array1.length;i++)
        {
            result[i] = array1[i];
            index++;
        }
        //iterate second array and for each iteration of the second array, iterate the second array also and
        //add the element to the new array if it doesn't exist
        for(int i=0;i<array2.length;i++)
        {
            int flag=0;
            for(int j=0;j<index;j++)
            {
                if(array2[i]==result[j])
                {
                    flag=1;
                }
            }
            if(flag!=1)
            {
                result[index] = array2[i];
                index++;
            }
        }

        //creating a new array with unique elements without zeros at the end
        int[] nonZeroResult = new int[index];
        for(int i=0;i<index;i++)
        {
            nonZeroResult[i] = result[i];
        }

        //Using Bubble sort to sort the final array
        for(int i=0;i<index-1;i++)
        {
            for(int j=0;j<index-1-i;j++)
            {
                if(nonZeroResult[j]>nonZeroResult[j+1])
                {
                    int temp = nonZeroResult[j];
                    nonZeroResult[j] = nonZeroResult[j+1];
                    nonZeroResult[j+1] = temp;
                }
            }
        }

        //pritning the array
        System.out.print("The sorted array is : ");
        System.out.println(Arrays.toString(nonZeroResult));

    }
}
