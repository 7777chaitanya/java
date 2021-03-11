package com.searchandsort;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {15, 5, 20, 35, 2, 42, 67, 17};
        System.out.print("Enter the element that you want to find in the array...");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == data) {
                System.out.println("The number " + data + " is present at index postion : " + i);
                break;
            }
            if (i + 1 == a.length) {
                System.out.println("The element that you are searching for is not present in the array");
            }
        }
    }
}
