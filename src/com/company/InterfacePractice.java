package com.company;
interface Test1{
    void meth1();
    void meth2();
}
class Test2 implements Test1{
   public void meth1(){
       System.out.println("Implements meth1");
   }
    public void meth2(){
        System.out.println("Implements meth2");
    }
    public void meth3(){
        System.out.println("Implements meth3");
    }
}
public class InterfacePractice {
    public static void main(String[] args) {
        Test2 t=new Test2();
        t.meth1();
        t.meth2();
        t.meth3();
    }
}
