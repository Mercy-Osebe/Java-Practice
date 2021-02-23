package com.company.Mercy;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>(5,0.5f);
        hs.add(10);
        hs.add(15);
        hs.add(12);
        hs.add(16);
        hs.add(10);
        for(int x:hs)
            System.out.print(x+",");
    }
}
