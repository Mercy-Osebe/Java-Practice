package com.company;
import java.util.*;
public class pallindrome_reverse {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int r;
        int arm=0;
         int m=num;
        while(num>0)
        {
            r=num%10;
            num=num/10;
            rev=rev*10+r;
            arm=arm+r*r*r;
            //System.out.println(rev +"is the reversed number.");
            System.out.println(r);
        }
        System.out.println(rev +" is the reversed number.");
        System.out.println(arm +" is the armstrong number.");
        if(m==rev)
        {
            System.out.println("This is a pallindrome");
        }
        if(m==arm)
        {
            System.out.println("This is an armstrong no.");
        }
    }
}
