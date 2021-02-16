package com.company;
class Phone{
    public void call(){
        System.out.println("Make a phone call");
    }
    public void sms(){
        System.out.println("Text someone.");
    }
}
interface ICamera{
    void takeSnap();
    void click();
    void record();
}
interface IMusicPlayer{
    void play();
    void pause();
    void stop();
}
class SmartPhone extends Phone implements ICamera,IMusicPlayer{
    public void call(){
        System.out.println("Make a Smartphone call");
    }
    public void videoCall(){
        System.out.println("Video call someone");
    }
    public void takeSnap(){
        System.out.println("Take pic");
    }
    public void click(){
        System.out.println("press click");
    }

    public void record(){
        System.out.println("Press recording.");
    }
    public void play(){
        System.out.println("play music");
    }
    public void pause(){
        System.out.println("Music paused");
    }
    public void stop(){
        System.out.println("Stop playing music");
    }
}
public class InterfaceDemo{
    public static void main(String[] args) {
        SmartPhone s=new SmartPhone();
        Phone p=s;
        ICamera c=s;
        IMusicPlayer m=s;
        p.call();

    }
}
