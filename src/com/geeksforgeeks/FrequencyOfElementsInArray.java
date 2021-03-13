package com.geeksforgeeks;

public class FrequencyOfElementsInArray {
    public static void main(String[] args) {

        int[] input = {1, 2, 4, 5, 2, 1, 5, 2, 10, 22, 5};
        int n = input.length;
        int[] unique = new int[n];
        int[] frequency = new int[n];
        int index = 0;

        for (int i = 0; i < n - 1; i++) {
            int found = 0;
            for (int j = 0; j < unique.length; j++) {

                if (input[i] == unique[j]) {
                    found = 1;
                }
            }
            if (found != 1) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (input[i] == input[j]) {
                        count++;
                    }
                }
//                for (int j = 0; j < unique.length; j++) {
//                    int flag = 0;
//                    if (input[i] == unique[j]) {
//                        flag = 1;
//                    }
//                    if (flag != 1) {
                        unique[index] = input[i];
                        frequency[index] = count;
                        index++;
                        break;
                    }
                }


                for (int k = 0; k < unique.length; k++)
                {
                    System.out.print(unique[k]);
                    System.out.print("  ->  ");
                    System.out.print(frequency[k]);
                    System.out.println();
                }
            }
        }


