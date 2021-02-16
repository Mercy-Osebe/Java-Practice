package com.company;
import java.util.Scanner;
public class Fibonacci_series {
    public static void main(String[]args)
    {System.out.println("Solving the fibonacci series.");
        System.out.println("Enter the zeroth,first and nth terms:");
        Scanner sc=new Scanner(System.in);
        int zeroth=sc.nextInt();
        int first=sc.nextInt();
        int n=sc.nextInt();
        int c=zeroth+first;
        for(int i=0;i<=n;i++)
        {
            System.out.print(zeroth+","+first+ "," + c +",");
            c=c+n-3;
        }



    }
}
