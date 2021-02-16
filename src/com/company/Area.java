package com.company;
import java.lang.*;
import java.util.Scanner;
public class Area {
    public static void main(String[]args){
        System.out.println("Find the area of a triangle");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a,b and c of the triangle:");
        int a,b,c;
        float s;
        a=sc.nextInt();
        b =sc.nextInt();
        c =sc.nextInt();
        s=(a+b+c)/2f;
        System.out.println("The area value of s is:" +s);
        double Area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area is: "+ Area);

    }

}
