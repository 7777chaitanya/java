package com.hariSanjeev2;

public class ArrayUniqueUsingSorting {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,3,2,1,4,5,2};
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
          int flag=0,count=0;
          if(i<a.length-1)
          {
              for(int j=i+1;j<n;j++)
              {
                  if(a[i] == a[j])
                      count++;

                  else{

                      System.out.println(a[i]);
                      i+=count;
                      break;
                  }
              }
          }
          else
              System.out.println(a[i]);
        }

    }
}
