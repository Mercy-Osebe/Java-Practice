package com.company.Mercy;
import java.io.*;
class LowBalanceException extends Exception{
    public String toString(){
        return "Balance should not be less than 5000.";
    }

}
public class CheckedUncheckedExceptions {
    static void fun1(){/*try{
        FileInputStream fi=new FileInputStream("my.txt");}
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        */

    }
    static void fun2(){
        fun1();

    }
    static void fun3(){
        fun2();

    }
    public static void main(String[] args) {
        fun3();
        LowBalanceException l=new LowBalanceException();
        System.out.println(l.toString());
    }
}
