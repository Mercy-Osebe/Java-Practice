package com.company.Mercy;

import jdk.swing.interop.SwingInterOpUtils;

class DataSet{
    int value=0;
    boolean flag=true;

    synchronized public void setValue(int value) {
        while(flag!=true)
            try{
            wait();}catch(Exception e){
                System.out.println(e);
            }
        this.value = value;
            flag=false;
            notify();
    }

    synchronized public int getValue() {
        int x=0;
        while(flag!=false)
            try{
                wait();}catch(Exception e){
                System.out.println(e);
            }
        x = value;
        flag=true;
        notify();

        return x;
    }
}
class Producer extends Thread{
    DataSet d;
    public Producer(DataSet d){
        this.d=d;
    }
    public void run(){
        int i=1;
        while(true){
            d.setValue(i);
            System.out.println("producer:"+i);
            i++;
        }
    }
}

class Consumer extends Thread{
    DataSet d;
    public Consumer(DataSet d){
        this.d=d;
    }
    public void run(){
        while(true){
            System.out.println("Consumer:"+d.getValue());}
    }


}

public class InterThreadCommunication {
    public static void main(String[] args) {
        DataSet d = new DataSet();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);
        p.start();
        c.start();


    }
}