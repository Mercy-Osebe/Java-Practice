package com.company.Mercy;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.add(4);
        dq.addLast(23);
        dq.addLast(34);
        dq.addLast(15);
        dq.addLast(2);
        for(int x:dq)
            System.out.print(x+",");
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addFirst(4);
        for(int x:dq)
            System.out.print(x+",");
    }
}
