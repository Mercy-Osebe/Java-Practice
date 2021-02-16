package com.company.Mercy;

public class MultithreadingInJava {
    static void display(){
        int x=0;
        while(true){
            System.out.println(x+":Hello");
            x++;
        }

    }

    public static void main(String[] args) {
        display();
        int i=0;
        while(true){
            System.out.println(i+":World");
            i++;
        }
    }
}
