package com.company.Mercy;
class ATM{
    synchronized public void checkBalance(String name){
        System.out.print(name+":checking");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println( " balance");

    }
    synchronized public void withdrawCash(String name,int amount){
        System.out.print(name+":withdrawing: ");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(amount);
    }


}
class Customer extends Thread{
    ATM atm;
    String name;
    int amount;
    public Customer(String name,ATM atm,int amount){
        this.name=name;
        this.atm=atm;
        this.amount=amount;
    }

    /*public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

     */
    public void useATM(){
        atm.checkBalance(name);
        atm.withdrawCash(name,amount);
    }



    public void run(){
        useATM();
    }
}
public class ATMDemo {
    public static void main(String[] args) {
        ATM atm=new ATM();
        Customer c1=new Customer("Mercy",atm,5000);
        Customer c2=new Customer("Mike",atm,10000);
        Customer c3=new Customer("Lee",atm,1200);
        c1.start();
        c2.start();
        c3.start();


    }
}
