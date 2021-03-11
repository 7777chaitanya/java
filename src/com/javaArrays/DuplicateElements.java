package com.javaArrays;

import java.util.ArrayList;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4,8, 2, 7, 8, 8, 3};
        int[] unique = new int[a.length];
        ArrayList<Integer> uniqueList = new ArrayList<Integer>();
        int flag;

        for(int i =0; i<a.length-1;i++)

        {
            flag = 0;
            for(int j = i+1;j<a.length;j++)
            {
                if(a[i] == a[j])
                {
                    for(int element : uniqueList)
                    {
                        if(element == a[i])
                        {

                            break;
                        }
                    }
                    if(flag ==1)
                    {
                        uniqueList.add(a[i]);
                    }
                    break;

                }
            }


        }
        System.out.println(uniqueList);
    }
}
