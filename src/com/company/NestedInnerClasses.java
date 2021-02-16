package com.company;
class Outer{
    int x=10;
    class Inner{
        int y=20;
        public void innerDisplay(){
            System.out.println("the value of x is: "+x+" and y is:  "+y);
        }
    }


    public void outerDisplay(){
        Inner i=new Inner();
        i.innerDisplay();
        System.out.println("the sum is: "+(x+i.y));

    }

}
public class NestedInnerClasses {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.outerDisplay();

    }
}
