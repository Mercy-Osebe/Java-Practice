package com.company;

class ToyotaXtrail{
    static long price=1200000;
    int a,b;
    static double onRoadPrice(String city){
        switch(city) {
            case "Mombasa":
                return price + price * 0.09;
            case "Nairobi":
                return price + price * 0.15;
            case "RiftValley":
                return price + price * 0.12;
        }
        return price;
    }
}
public class StaticMethods {
    public static void main(String[] args) {
        System.out.println(ToyotaXtrail.onRoadPrice("Nairobi"));
        ToyotaXtrail t=new ToyotaXtrail();
        System.out.println(t.price);
        System.out.println(t.onRoadPrice("RiftValley"));
    }
}
