package com.hariSanjeev3;

import java.util.Arrays;

public class Sort2 {
    public static void main(String[] args) {
        String[] arr = {"1", "14", "100", "3", "38", "425", "6", "82"};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].length() == arr[j + 1].length()) {
                    for (int k = 0; k < arr[j].length(); k++) {
                        if (arr[j].charAt(k) > arr[j + 1].charAt(k)) {
                            String temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
