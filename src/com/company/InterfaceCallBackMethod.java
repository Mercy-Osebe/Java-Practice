package com.company;
interface Member{
    void callBack();
}
class Store{
    Member mem[]=new Member[100];
    int count=0;
    public void register(Member m){
        mem[count++]=m;

    }
    public void inviteSale(){
        for(int x=0;x<count;x++)
            mem[x].callBack();
    }

}

class Customer1 implements Member{
    String name;
    public Customer1(String n){
        name=n;
    }
    public void callBack(){
        System.out.println("I will visit."+name);
    }
}
class Customer2{
    String name;
    String address;
    public Customer2(String name,String address){
        this.name=name;
        this.address=address;
    }
}



public class InterfaceCallBackMethod {
    public static void main(String[] args) {
        Store s=new Store();
        Customer1 C1=new Customer1("Mercy");
        Customer1 C2=new Customer1("Mike");
        s.register(C1);
        s.register(C2);
        s.inviteSale();


    }
}
