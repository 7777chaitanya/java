package com.manimaranBlog;

import java.util.Scanner;

public class MatrixMax {
    public static void main(String[] args) {

        //Getting details about the matrix from the user
        System.out.print("Enter the number of rows in the Matrix : ");
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        System.out.print("Enter the number of columns in the Matrix : ");
        int columns = scn.nextInt();

        //getting the value of each index from the user
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the value at [" + i + "] [" + j + "] : ");
                matrix[i][j] = scn.nextInt();
            }
        }

        //printing the input matrix after getting the values from the user
        System.out.println("The input matrix is as follows");

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

        //Asking the user to enter the index of the element to check the condition
        System.out.println("Enter the index position that you want to make the change to in m*n format..");
        System.out.println("Enter the value of m : ");
        int m = scn.nextInt();
        System.out.println("Enter the value of n : ");
        int n = scn.nextInt();


        //Checking the required conditon
        //corner cases first
        //top left corner
        if(m==0 && n==0)
        {
            if(matrix[m][n] <  matrix[m][n+1])
            {
                matrix[m][n] = matrix[m][n+1];
            }
            if(matrix[m][n] < matrix[m+1][n])
            {
                matrix[m][n] = matrix[m+1][n];
            }
        }

        //top right corner
        else if(m==0 && n== columns-1)
        {
            if(matrix[m][n-1] > matrix[m][n])
            {
                matrix[m][n] = matrix[m][n-1];
            }
            if(matrix[m][n] < matrix[m+1][n])
            {
                matrix[m][n]=matrix[m+1][n];
            }
        }

        //bottom left corner
        else if(m==rows-1 && n==0)
        {
            if(matrix[m][n] < matrix[m-1][n])
            {
                matrix[m][n]=matrix[m-1][n];
            }
            if(matrix[m][n] < matrix[m][n+1])
            {
                matrix[m][n] = matrix[m][n+1];
            }
        }

        //bottom right corner

        else if(m==rows-1 && n==columns-1)
        {
            if(matrix[m][n-1] > matrix[m][n])
            {
                matrix[m][n] = matrix[m][n-1];
            }
            if(matrix[m-1][n] > matrix[m][n])
            {
                matrix[m][n] = matrix[m-1][n];
            }
        }

        //case check for elements on the edges
        else if(n == 0)
        {
            if(matrix[m-1][n]>matrix[m][n])
            {
                matrix[m][n] = matrix[m-1][n];
            }
            if(matrix[m+1][n]>matrix[m][n])
            {
                matrix[m][n] = matrix[m+1][n];
            }
            if(matrix[m][n+1]>matrix[m][n])
            {
                matrix[m][n] = matrix[m][n+1];
            }
        }

        else if(m == 0)
        {
            if(matrix[m][n-1]>matrix[m][n])
            {
                matrix[m][n] = matrix[m][n-1];
            }
            if(matrix[m+1][n]>matrix[m][n])
            {
                matrix[m][n] = matrix[m+1][n];
            }
            if(matrix[m][n+1]>matrix[m][n])
            {
                matrix[m][n] = matrix[m][n+1];
            }
        }
        else if(m == rows-1)
        {
            if(matrix[m-1][n]>matrix[m][n])
            {
                matrix[m][n] = matrix[m-1][n];
            }
            if(matrix[m][n-1]>matrix[m][n])
            {
                matrix[m][n] = matrix[m][n-1];
            }
            if(matrix[m][n+1]>matrix[m][n])
            {
                matrix[m][n] = matrix[m][n+1];
            }
        }
        else if(n == columns-1)
        {
            if(matrix[m-1][n]>matrix[m][n])
            {
                matrix[m][n] = matrix[m-1][n];
            }
            if(matrix[m+1][n]>matrix[m][n])
            {
                matrix[m][n] = matrix[m+1][n];
            }
            if(matrix[m][n-1]>matrix[m][n])
            {
                matrix[m][n] = matrix[m][n-1];
            }
        }

        //case check for elements that are not present on the edges or the corner
        else
        {
            if(matrix[m-1][n]>matrix[m][n])
            {
                matrix[m][n] = matrix[m-1][n];
            }
            if(matrix[m+1][n]>matrix[m][n])
            {
                matrix[m][n] = matrix[m+1][n];
            }
            if(matrix[m][n-1]>matrix[m][n])
            {
                matrix[m][n] = matrix[m][n-1];
            }
            if(matrix[m][n+1]>matrix[m][n])
            {
                matrix[m][n] = matrix[m][n+1];
            }

        }

        //for printing the output matrix
        System.out.println("The output matrix is as follows");

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
