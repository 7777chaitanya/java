package com.hariSanjeev2;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        //declare an array
        int[] a = {1, 2, 3, 2, 1, 2, 3};

        for (int i = 0; i < a.length; i++) {
            int flag = 0;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j])
                    flag = 1;
            }

            if (flag == 0)
                System.out.print(a[i]+"   ");
        }
    }
}

