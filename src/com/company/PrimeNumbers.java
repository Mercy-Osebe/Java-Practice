package com.company;
import java.util.*;

public class PrimeNumbers {
    static boolean prime(int p){
        for (int i = 2; i < p; i++) {
            if(p%i == 0)
            {
                return false;
            }

        }

        return true;
         }



    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        while (true){
            int x=sc.nextInt();
            boolean res = prime(x);
            System.out.println(x+":This is a prime number: "+res);
        }

    }
}
