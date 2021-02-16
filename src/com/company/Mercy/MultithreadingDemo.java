package com.company.Mercy;

public class MultithreadingDemo extends Thread{
    public void run(){
        byte x=1;
        while(true){
            System.out.println(x+":Hello");
            x++;
        }
    }

    public static void main(String[] args) {
        MultithreadingDemo md=new MultithreadingDemo();
        md.start();
        byte x=1;
        while(true){
            System.out.println(x+":World");
            x++;
        }
    }
}
