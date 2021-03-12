package com.geeksforgeeks;

import java.util.Scanner;

public class SnakePattern {
    public static void main(String[] args) {
        int printer=1;
        System.out.print("Enter the number of rows that you want to print.....");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        //loop to print the number of rows
        for(int i=0;i<n;i++)
        {
            //loop to print the space before the numbers
            for(int j=1;j<n-i;j++)
            {
                System.out.print("    ");
            }

                //logic to print the numbers in asceding order whenever the linenumber is even
                if(i%2 == 0)
                {
                    for(int k=printer;k<=((i+1)*4);k++)
                    {
                        System.out.print(printer);
                        if(printer+10 <= 19)
                        {
                            System.out.print("   ");
                        }
                        else
                            System.out.print("  ");
                        printer++;
                    }
                }

                //logic to print the numbers in asceding order whenever the linenumber is odd
                else
                {
                    for(int k=printer+3;k>=(i*4)+1;k--)
                    {
                        System.out.print(k);
                        if(printer+10 <= 19)
                        {
                            System.out.print("   ");
                        }
                        else
                            System.out.print("  ");
                        printer++;
                    }
                }
            System.out.println();
            System.out.println();
            }
        }
    }

