package com.javaList;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        for(String fruit:list)
        {
            System.out.println(fruit);
        }
    }
}
