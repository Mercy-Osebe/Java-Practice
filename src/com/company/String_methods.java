package com.company;

public class String_methods {
    public static void main(String[]args)
    {
        String x="String literals reference method has data stored in heap.";
        String y="String literals reference method has data stored in heap.";
        String z=("by declaring the object new we create a new reference with data stored in heap.");
        String a=new String(x);
        System.out.println(x.equals(y));
        System.out.println(x.equals(a));
        System.out.println(x==a);
    }
}
