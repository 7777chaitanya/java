package com.javaArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrays {
    public static void main(String[] args) {
        String[] arr = {"chaitanya", "SreenivasaRao", "vijaya Lakshmi"};
        for(String s:arr)
        {
            System.out.println(s);
        }
        List<String> arrlist = Arrays.asList(arr);
        ArrayList<String> arrarraylist = new ArrayList<String>(arrlist);
        arrarraylist.add("venkat");
        arrarraylist.add("sting ray");
        System.out.println(arrarraylist);
        for(String s:arrarraylist)
        {
            System.out.println(s);
        }

    }
}
