package com.company;
import java.util.Scanner;
public class Arithmetic_progression {
    public static void main(String[]args)
    {System.out.println("Arithmetic series:");
        System.out.println("Enter the a,d and n terms:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int multiple=sc.nextInt();
        int n=sc.nextInt();
        /*int term=a;
        for(int i=0;i<=n-1;i++)
        {
            System.out.print(term +",");
            term=term+d;

        }

         */
        int term=a;
        for(int i=0;i<=n-1;i++)
        {
           System.out.print(term +",");
           term=term*multiple;
        }

    }
}
