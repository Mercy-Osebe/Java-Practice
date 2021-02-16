package com.company;

import org.w3c.dom.ls.LSOutput;

class Circle{
    public double rad;
    public double area(){
        return Math.PI*rad*rad;
    }
    public double perimeter(){
        return Math.PI*(2*rad);
    }
}
class rectangle {
    public int length;
    public int width;

    public int area() {
        return 2 * length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }

    public boolean istrue = true;

    public boolean isSquare() {
        if (length == width) {
            System.out.println("the length is equal to the width: " + istrue);
        }


        return istrue;

    }
}
    class Cylinder{
    public int h;
    public int r;
    public double vol()
    {
        return  Math.PI*r*r*h;
    }
    public double lidArea()
    {
        return 2*Math.PI*r*r;
    }
    public double totalSurfaceArea()
    {
        double cir=2*Math.PI*r;
        return lidArea()+cir*h;
    }

    }
class Student{

    public String reg;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total(){
        int sum=m1+m2+m3;
        return sum;

    }
    public float average(){
        int ave=total()/3;
        return ave;
    }
    public void grade(){
        if(average()>=60)
        {
            System.out.println("The student scored an:A");
        }
        else if(average()<=40&&average()<60)
        {
            System.out.println("Student scored a :B");
        }
        else
            System.out.println("The student failed.");
    }
}


public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.rad=7;
        System.out.println("Area is:"+c.area());
        System.out.println("Perimeter is:"+c.perimeter());
        rectangle r=new rectangle();
        r.width=27;
        r.length=27;
        System.out.println("Rectangle area is:"+r.area());
        System.out.println("Rectangle perimeter is:"+r.perimeter());
        r.isSquare();
        Cylinder cy=new Cylinder();
        cy.h=12;
        cy.r=14;
        System.out.println("The cylinder lid area is: "+cy.lidArea());
        System.out.println("The cylinder volume is: "+cy.vol());
        System.out.println("The cylinder total Surface Area is: "+cy.totalSurfaceArea());
        Student s=new Student();
        s.m1=56;
        s.m2=76;
        s.m3=64;
        System.out.println("Total is: "+s.total());
        System.out.println("Average is: "+s.average());
        s.grade();




    }

}
