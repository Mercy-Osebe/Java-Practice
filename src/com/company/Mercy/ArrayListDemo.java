package com.company.Mercy;
import java.lang.*;
import java.util.*;

public class ArrayListDemo {

        public static void main(String[]args){
        LinkedList<Integer> al1=new LinkedList<>();
        LinkedList<Integer>al=new LinkedList<>(List.of(12,34,67,78,9,14));
        al1.add(0,11);
        al1.add(0,12);
        al1.add(5);
        al1.add(7);
        al1.add(18);
        al1.add(67);
            System.out.println(al1.pop());
            al1.add(12);
            al1.add(12);
            System.out.println(al1);
            al1.addAll(1,al);
            System.out.println(al1.set(3,45));
            System.out.println("==============================");
            System.out.println(al1.clone());
            System.out.println(al1.contains(12));
            System.out.println(al1.equals(al));
            int sum=0;
            for (Integer x : al1) {
                System.out.println(x);
                sum = sum + x;
                System.out.println("Cumulative sum: " + sum);


            }
            System.out.println("Total sum: "+sum);
            for(ListIterator<Integer>it=al1.listIterator(); it.hasNext();)
                System.out.println(it.next());
            al1.forEach(System.out::println);



    }
}
