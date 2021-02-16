package com.company;

import java.util.concurrent.Callable;

class CoffeeMachine{
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;
    //defining a null reference and making it private and static naming it 'my'
    static private CoffeeMachine my=null;
    //why private->for it not to be directly accessible
    // why static reference?->its going to be accessed by static instance method.
    // creating constructors for the class properties & making it private
    private CoffeeMachine(){
        coffeeQty=1;
        milkQty=1;
        waterQty=1;
        sugarQty=1;
    }
    public void fillWater(float qty){
        waterQty=qty;
    }
    public void fillSugar(float qty){
        sugarQty=qty;
    }
    public float getCoffeeQty(){
        return 0.23f;
    }
    static CoffeeMachine getInstance(){
        if(my==null)
            my=new CoffeeMachine();
        return my;
    }

}

public class Singleton {
    public static void main(String[] args) {
        CoffeeMachine m1=CoffeeMachine.getInstance();
        CoffeeMachine m2=CoffeeMachine.getInstance();
        CoffeeMachine m3=CoffeeMachine.getInstance();
        System.out.println(m1+" "+m2+" "+m3);
    }
}
