package com.company.Mercy;
class LetterDisplay{
    synchronized public void display(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }

    }

}
class Thread1 extends Thread{
    LetterDisplay ld;

    public Thread1(LetterDisplay ld){
        this.ld=ld;

    }
    public void run(){
        ld.display("Hello World this is fourteenth of february");

    }
}
class Thread2 extends Thread{
    LetterDisplay ld;

    public Thread2(LetterDisplay ld){
        this.ld=ld;

    }
    public void run(){
        ld.display("\nThank you for valentines");

    }
}

public class MonitorSynchronisation{
    public static void main(String[] args) {
        LetterDisplay ld=new LetterDisplay();
        Thread1 t1=new Thread1(ld);
        Thread2 t2=new Thread2(ld);
        t1.start();
        t2.start();

    }

}
