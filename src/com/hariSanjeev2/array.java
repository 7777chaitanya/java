package com.hariSanjeev2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] arr = {3,2,1,1,2};
        int n = arr.length;
        //sort the array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        //iterate till last element-1
        for (int i = 0; i < n; i+=0) {

            //initialize count=1
            int count = 0;

            //iterate from i+1 till last element;j=i+1;j<n;j++

                for (int j = i + 1; j < n; j++) {


                    //IF(arr[i] == arr[j]
                    if (arr[i] == arr[j]) {
                        //count++
                        count++;
                    }
                    //ELSE
                    else {
                        //sout(arr[i]
                        System.out.println(arr[i]);
                        count++;
                        i += count;
                        break;
                    }
                }
            }

        }
    }

