package com.company;

class Circle2{
    private int rad;

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        if(this.rad>0)
        this.rad = rad;
        else
            this.rad=1;
    }

    public Circle2()
    {
        rad=0;
    }
    public Circle2(int rad){
        this.rad=rad;
    }

    public double area(){
        return Math.PI*rad*rad;

    }

}
class Cylinder2 extends Circle2
{
    private int hei;
    public Cylinder2(int hei){
        this.hei=hei;

    }
    public Cylinder2(int rad,int hei){
        super(rad);
        this.hei=hei;
    }
    public double volume(){
        return area()*hei;
    }
}
public class This_Super {
    public static void main(String[] args) {
        Circle2 c=new Circle2(1);
        System.out.println(c.area());
        System.out.println("The constructor value is executed irregardless.");
        c.setRad(5);
        Cylinder2 c2=new Cylinder2(7,23);
        c.setRad(56);
        System.out.println("Volume: "+c2.volume());
    }
}
