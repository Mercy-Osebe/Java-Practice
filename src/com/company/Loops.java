package com.company;

import java.util.Scanner;

public class Loops {
    public static void main(String[]args)
    {
        /*Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int y=0;y<=10;y++)
        {
            System.out.println(x+" x "+ y +"=" + (x*y));
        }*/
        int sum=1;

        for(int x=1; x<=10;x++)
        {sum=sum*x;
            System.out.println("The factorial is:"+ (x=x++) +" "+sum);
        }
    }
}
