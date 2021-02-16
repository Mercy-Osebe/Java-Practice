package com.company;

public class Two_dimensional_arrays {
    public static void main(String[] args) {
        int a[][]=new int[5][5];
        int b[][];
        b=new int[3][];
        b[0]=new int[3];
        b[1]=new int[6];
        b[2]=new int[4];
        System.out.println(b.length);
        for (int i = 0; i <b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+",");
            }
            System.out.println("");

        }



        /*int x[][]={{1,2,3,4},{2,4,6,8},{3,5,7,9}};
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <x[0].length ; j++) {
                System.out.print(x[i][j]+",");
            }
            System.out.print("\n");
        }

         */


    }
}
