package com.company.Mercy;
class Mercy{
    private static int x;
    static int y=12;
    static int sum;

    public Mercy(){
        x=20;
    }
    static{ x=3;}

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        Mercy.x = x;
    }

    public void display() {
          class Locale {
             public void sumOf() {
                 sum = x + y;
                 System.out.println(sum);
             }

         }
         Locale l = new Locale();
         l.sumOf();

     }



}

public class LocalInnerClass {
    public static void main(String[] args) {
        Mercy m=new Mercy();
        Mercy.setX(7);
       m.display();






    }
}
