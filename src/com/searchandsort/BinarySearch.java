package com.searchandsort;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] a, int n, int data) {
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a[mid] == data) {
                return mid;
            } else if (data < a[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

        public static void main (String[]args){
            int[] a = {5, 9, 17, 23, 25, 45, 59, 63, 71, 89};
            System.out.print("Enter the number that you want to search...");
            Scanner scanner = new Scanner(System.in);
            int data = scanner.nextInt();

            int result = binarySearch(a, a.length, data);
            if(result == -1){
                System.out.println("The element is not present in the array");
            }
            else
            {
                System.out.println("The index of the requested element is : "+result);
            }

        }

}
