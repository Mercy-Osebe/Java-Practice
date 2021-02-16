package com.company.Mercy;


abstract class My{
   public void printa(){
       System.out.println("hello");
   }

    abstract public void show();
}
class Outer{
    public void display(){
        //anonymous class inheriting from class My
        //new My() {@Override public void show() {System.out.println("Hello");}};.show();
        My m= new My() {
            @Override
            public void show() {

            }
        };
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.display();
    }
}
