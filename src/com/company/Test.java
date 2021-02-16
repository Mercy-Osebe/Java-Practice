//package com.company;

public class Test {

    public static int global=0;

    public static void add(int x) {
        global++;
    }

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            add(Integer.parseInt(args[i]));

        }
        System.out.println("sum = "+ global);
        System.out.println("yeeeiy");
    }
}
