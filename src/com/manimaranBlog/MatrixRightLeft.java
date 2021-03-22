package com.manimaranBlog;

import java.util.Scanner;

public class MatrixRightLeft {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows in the matrix : ");
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        System.out.print("Enter the number of columns in the matrix : ");
        int columns = scn.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the value at index " + i + "*" + j+" : ");
                matrix[i][j] = scn.nextInt();
            }
        }
        System.out.println();

        System.out.println("Enter the index from where you want to find the number of routes in the form of m*n: ");
        System.out.print("Enter the value of m : ");
        int m = scn.nextInt();
        System.out.print("Enter the value of n : ");
        int n = scn.nextInt();
        System.out.println(path(m, n, rows-1, columns-1));

    }

    private static int path(int m, int n, int rows, int columns) {
        if (m == rows && n == columns) {
            System.out.println(m+"*"+n);
            return 1;
        }
        else if(m> rows || n> columns){
            System.out.println(m+"*"+n);
            return 0;
        }
        else {
            System.out.println(m+"*"+n);
            return path(m + 1, n, rows, columns) + path(n + 1, m, rows, columns);
        }
    }
}


