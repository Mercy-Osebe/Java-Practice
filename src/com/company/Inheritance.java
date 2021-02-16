package com.company;

class Rect3{
    private int len;
    private int wid;
    public Rect3(){
        len=wid=1;
    }
    public Rect3(int l,int w){
        len=l;
        wid=w;
    }
    public int area(){
      return len*wid;
    }


}
class Cuboid extends Rect3{
    private int hei;
    public Cuboid(){
        hei=1;
    }
    public Cuboid(int h){
        hei=h;
    }
    public Cuboid(int l,int w,int h){
        super( l,w);
        hei=h;

    }
    public int volume(){
        return area()*hei;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Cuboid c=new Cuboid(12,3,4);
        System.out.println(c.volume());
    }
}
