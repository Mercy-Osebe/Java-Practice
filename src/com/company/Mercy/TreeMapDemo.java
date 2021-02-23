package com.company.Mercy;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String>tm=new TreeMap<>(Map.of(0,"a",1,"b",2,"c"));
        Map.Entry<Integer,String> e=tm.firstEntry();
        System.out.println(e.getKey()+" "+e.getValue());
        System.out.println(tm.lastKey());
        System.out.println(tm);
    }
}
