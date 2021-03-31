package com.javaArrays;

import java.util.Arrays;

public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        int n = arr.length;
        int maxSum = arr[0];
        int[] maxi = new int[0];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
                int sum = 0;
                int[] arr1 = new int[j + 1];
                int flag = 0;
                for (int k = 0; k <= j; k++) {
                    arr1[k] = arr[i + k];
                    sum += arr[i + k];

                    if (sum > maxSum) {
                        maxSum = sum;
                        flag = 1;

                    }

                }
                if (flag == 1) {

                    maxi = new int[j + 1];
                    for (int k = 0; k <= j; k++) {
                        maxi[k] = arr1[k];
                    }

                }

            }
        }

        System.out.println(Arrays.toString(maxi));
        System.out.println(maxSum);
        System.out.println();
        System.out.println();
    }
}
