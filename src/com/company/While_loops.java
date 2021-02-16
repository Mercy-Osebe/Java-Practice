package com.company;
import java.util.Scanner;
import java.math.*;

public class While_loops
{
    /*public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int r;
        int m=0;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            m=m+1;
            System.out.println("Digits in a number.");
            System.out.println(r);
        }
        System.out.println("Counted numbers.");
        System.out.println(m);
    }

     */
//Finding the armstrong number and reversing.
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int r,armstrong,reversed;
        int sum=0;
        int m=num;
        reversed=0;
        while(num>0)
        {
            r=num%10;
            num=num/10;
            armstrong=r*r*r;
            sum=sum+armstrong;
            reversed=reversed*10+r;


            System.out.println("The armstrong number is:");
            System.out.println(sum);
            System.out.println(reversed +" is the reversed number");
        }

        System.out.println("The armstrong number is:");
        System.out.println(sum);

        if(m==sum)
        {
            System.out.println("The number is an armstrong number.");
        }
        else
        {
            System.out.println("Not an armstrong number.");
        }

    }

}

