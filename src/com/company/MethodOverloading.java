package com.company;

public class MethodOverloading {
    int area(int x,int y)
    {
        return (x*y);
    }
    double area(int r,float pi)
    {
        return(pi*r*r);
    }


    public static void main(String[] args) {
        int l=24;int w=10;
            MethodOverloading a=new MethodOverloading();
            double res=a.area(12,3.142f);
            System.out.println(res);
    }
}
