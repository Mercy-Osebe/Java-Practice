package com.company;

import java.util.Arrays;

public class Rotation {
    public static void main(String[]args) {
        int x[] = {1, 2, 5, 8, 1, 3, 61, 7};
        x[3] = 10;
        System.out.println("Deleting no in an array,rotating it and inserting elements");
        for (int y : x) {
            System.out.print(y + ",");
        }
        System.out.println("");
        System.out.println("mike code ================================");
        System.out.print(x[x.length-1 ]+ ",");

        for (int i = 0; i < x.length - 1; i++) {
            System.out.print(x[i] + ",");
        }
        System.out.println("================================");
        System.out.println(x);
        /*System.out.println("Left array rotation");
        int temporary = x[0];
        for (int i = 1; i < x.length; i++) {
            System.out.print(x[i] + ",");
        }
        System.out.print(x[x.length - 1] = temporary);

        System.out.println("");
        System.out.println("right array rotation");
        for (int y : x) {
            System.out.print(y + ",");
            }
        */
        int temp = x[x.length-1];
        System.out.println("");
        System.out.print(x[0] = temp);
        for (int z = 0; z < x.length-1; z++) {
            System.out.print(x[z] + ",");
        }

    }
}
