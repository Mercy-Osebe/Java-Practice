package com.company;

public class MethodArrayReversal {

    static void reverse(int A[])

    {
        int array[]=new int[A.length];
        for (int i = A.length-1,j=0; i >=0 ; i--,j++) {
          array[j]=A[i];
          System.out.print(array[j]+",");

        }
    }




    public static void main(String[] args) {
        int x[]={1,3,5,2,7,9,23};
        reverse(x);

    }
}
