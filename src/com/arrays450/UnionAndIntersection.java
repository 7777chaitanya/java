package com.arrays450;

import java.util.Arrays;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] a = {2, 5, 6};
        int[] b = {4, 6, 8, 10};
        int[] union = new int[a.length + b.length];
        int[] intersection = new int[a.length + b.length];
        int indexI = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    intersection[indexI] = a[i];
                    indexI++;
                }
            }
        }
        System.out.println(indexI);
        int[] nonzeroIntersection = new int[indexI];
        for (int i = 0; i < indexI; i++) {
            nonzeroIntersection[i] = intersection[i];
        }

        int indexU = 0;

        for (int i = 0; i < a.length; i++) {
            union[i] = a[i];
            indexU++;

        }


        for (int i = 0; i < b.length; i++) {
            int flag = 0;
            for (int j = 0; j < indexU; j++) {
                if (b[i] == union[j]) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                union[indexU] = b[i];
                indexU++;
            }
        }


        int[] nonzeroUnion = new int[indexU];
        for(int i=0;i<indexU;i++)
        {
            nonzeroUnion[i] = union[i];
        }

        for(int i=0;i<indexU-1;i++)
        {
            for(int j=0;j<indexU-1;j++)
            {
                if(nonzeroUnion[j]>nonzeroUnion[j+1])
                {
                    int temp = nonzeroUnion[j];
                    nonzeroUnion[j] = nonzeroUnion[j+1];
                    nonzeroUnion[j+1] = temp;
                }
            }
        }
        System.out.print("Union : ");
        System.out.println(Arrays.toString(nonzeroUnion));
        System.out.print("Intersection : ");
        System.out.println(Arrays.toString(nonzeroIntersection));


    }
}
