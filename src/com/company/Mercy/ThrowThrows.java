package com.company.Mercy;

public class ThrowThrows {
    static int area(int len,int wid)throws Exception{
        if(len<0||wid<0)
            throw new Exception("Length or width cannot be less than zero.");
            int a = len * wid;
            return a;
    }
    static void meth1(){
        try{
        int a=area(10,3);
        System.out.println(a);}
        catch(Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        meth1();

    }
}
