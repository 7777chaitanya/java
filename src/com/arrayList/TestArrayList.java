package com.arrayList;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        System.out.println(arr);

        ArrayList<String> arrstring = new ArrayList<String>();
        arrstring.add("Hello friend");
        arrstring.add("bye friend");
        arrstring.add("Chaitanya");
        System.out.println(arrstring.contains("Chaitanya"));
        System.out.println(arrstring);
    }
}
