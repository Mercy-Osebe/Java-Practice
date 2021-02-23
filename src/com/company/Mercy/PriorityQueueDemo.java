package com.company.Mercy;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(18);
        pq.add(45);
        pq.add(23);
        pq.add(75);
        pq.add(78);
        pq.add(94);
        System.out.println(pq.add(4));
        for(int x:pq)
            System.out.print(x+",");
    }
}
