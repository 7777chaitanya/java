package com.geeksforgeeks;

import java.util.Arrays;
import java.util.Scanner;

public class ZeckendorfTheorem {
    public static void main(String[] args) {
        System.out.print("Enter the number for which you want to check");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] fib = new int[number];
        int temp1 = 0;
        int temp2 = 1;
        fib[0] = temp1;
        fib[1] = temp2;
        int count = 2;
        while(count<number)
        {
            int temp3 =temp1+temp2;
            temp1 = temp2;
            temp2 = temp3;
            fib[count] = temp3;
            count++;
        }
        System.out.println(Arrays.toString(fib));

    }
}
