package com.company;
import java.util.*;
public class Quardratic {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double sq,r1,r2;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sq=Math.sqrt((b*b)-(4*a*c));
        r1=(-b+sq)/(2*a);
        r2=(-b-sq)/(2*a);
        System.out.println("The roots are:" +r1);
        System.out.println("and the root 2 is:" +r2);
    }
}
