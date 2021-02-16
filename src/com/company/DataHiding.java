package com.company;


class Rectangle2{
   private int length;
   private int width;
   public int getLength(){
       return length;
   }
   public void setLength(int l){
       length=l;
   }
    public int getWidth(){
        return width;
    }
    public void setWidth(int w){
       width=w;
    }
    public int area()
    {
        return getLength()*getWidth();
    }
    public int perimeter()
    {
        return 2*(getWidth()+getLength());
    }

}
public class DataHiding {
    public static void main(String[] args) {
        Rectangle2 rec=new Rectangle2();
        rec.setLength(12);
        rec.setWidth(34);
        System.out.println("Area is:"+rec.area());
        System.out.println("Perimeter is:"+rec.perimeter());
    }
}
