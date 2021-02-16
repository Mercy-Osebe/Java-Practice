package com.company;
import java.util.*;
public class PrimeNumbers2 {
    static boolean prime(int p){
        for (int i = 2; i <p/2 ; i++) {
            if(p%i==0)
            {
                return false;
            }

        }

        return true;

    }



    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      boolean c=prime(x);
        System.out.println(x+"is a prime number."+c);
    }
}
