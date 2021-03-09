package com.javapractise;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args)
    {
    int flag = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number to check if it is prime or not....");
    int inputNumber = scanner.nextInt();

    for(int i=2; i<=(inputNumber/2); i++)
    {
        if((inputNumber % i) == 0)
        {
            flag = 1;
            break;
        }
    }
    if(flag == 1)
    {
        System.out.println("not a prime number");
    }
    else
    {
        System.out.println("It is a prime number");
    }
}

}
