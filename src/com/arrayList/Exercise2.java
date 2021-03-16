package com.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String element;
        int option;
        do {
            System.out.println("Choose any one of the following 4 options....");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            option = scanner.nextInt();
            if(option == 1){
                System.out.print("Enter the string that you want to add to the array list....");
                element = scanner.next();
                arr.add(element);

            }
            else if(option == 2){
                System.out.print("Enter the element that you want to remove.....");
                element = scanner.next();
                arr.remove(element);

            }
            else if(option ==3){
                System.out.print("The array list is...");
                System.out.println(arr);
            }
            else{
                break;
            }
            System.out.println("-------------------------------------------------------");
        }while(option != 4);
    }
}
