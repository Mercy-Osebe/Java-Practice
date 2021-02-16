package com.company;
class Car{
    public void start(){
        System.out.println("Start car engine.");
    }
    public void accelerate(){
        System.out.println("engine accelerated.");
    }
    public void changeGear(){
        System.out.println("Manually changed gear.");
    }
}
class LuxuryCar extends Car
{
    public void changeGear(){
        System.out.println( " Automatically changed gear.");
    }
    public void roof(){
        System.out.println("Open sun-roof.");
    }
}
class BoogieCar extends Car
{

}


public class CarOverridingDemo {
    public static void main(String[] args) {
        LuxuryCar l=new LuxuryCar();
        l.roof();
        l.changeGear();
        l.start();
        Car c=new Car();
        c.accelerate();
        c.start();c.changeGear();
    }
}
