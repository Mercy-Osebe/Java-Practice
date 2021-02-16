package com.company;
class TV{
    public void switchTV(){
        System.out.println( "TV is switched on.");
    }
    public void changeChannel(){
        System.out.println( "TV channel is changed.");
    }
}
class SmartTV extends TV{
    public void switchTV(){
        System.out.println( "SmartTV is switched on.");
    }
    public void changeChannel(){
        System.out.println( "SmartTV's channel is changed.");
    }
    public void browse(){
        System.out.println("internet browsing is on.");
    }
}
public class Overriding {
    public static void main(String[] args) {
        TV t=new TV();
        t.switchTV();
        t.changeChannel();
        SmartTV st=new SmartTV();
        st.switchTV();
        st.changeChannel();
        st.browse();
        TV tv=new SmartTV(); //dynamic method dispatch
        tv.switchTV();
        tv.changeChannel();


    }
}
