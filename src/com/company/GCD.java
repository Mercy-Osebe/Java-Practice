package com.company;

public class GCD {
    static int greatest(int m,int n){
        while(m!=n) {
            if (m > n) {
                m = m - n;
            } else {
                n = n -m;
            }
        }
        System.out.println(n+"is the GCD");
        return n;
    }

    public static void main(String[] args) {
        int x=6;int y=16;
        greatest(x,y);
        System.out.println("end line");
    }
}
