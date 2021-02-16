package com.company;
class Cyl
{
   private int rad;
   private int hei;
   public int setRad(){
     return rad;
   }
    public int setHei(){
        return hei;
    }
   public void getDimensions(int r,int h){
       if(rad>0&&hei>0){
           rad=r;
            hei=h;}
       else
       {rad=0;
       hei=0;}

   }
   public Cyl(){
       hei=1;
       rad=2;
   }
   public Cyl(int r,int h){
       rad=r;
       hei=h;
   }
   public double volume(){
       return Math.PI*rad*rad*hei;
   }






}


public class CylinderPrac {

    public static void main(String[] args) {
        Cyl c=new Cyl(-1,64);
        c.getDimensions(1,4);
        System.out.println("Volume: "+c.volume());
    }
}
