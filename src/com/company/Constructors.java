package com.company;
class DemoRect {
    private double len;
    private double wid;

    public DemoRect() {
        len = 1;
        wid = 1;
    }

    public DemoRect(double l, double w) {
        len = l;
        wid = w;
        //To validate the data use setters and getters i.e
        //setlen(l);
        //setwid(w);


    }

    public DemoRect(double s) {
        len = wid = s;
    }

    public double area() {
        return len * wid;
    }

    public double peri() {
        return 2 * (len + wid);
        /*
    }
    public double setLen(){
       return len;
    }
    public void getLen(){
        if(len>=0)
            len=l;
        else
            len=0;
    }

         */

    }
}

public class Constructors {
    public static void main(String[] args) {
        DemoRect D=new DemoRect(-12,-3);
        System.out.println("Area: "+D.area());
        System.out.println("Perimeter: "+D.peri());

    }
}
