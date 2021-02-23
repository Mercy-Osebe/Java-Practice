package com.company.Mercy;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Customer1 implements Serializable {
    String custID;
    String name;
    String phoneNo;
    static int count=1;

    public Customer1(){}
    public Customer1(String name,String phoneNo){
        custID="Tuskys/customer"+count;
        count++;
        this.name=name;
        this.phoneNo=phoneNo;
    }

        public String toString(){
        return "The customer is:"+name+"\nHis ID is:"+custID+"\nPhoneNo:"+phoneNo;
    }

}
public class CustomerSerialisation {
    public static void main(String[] args) {try {
        /*
        Customer1 list[]={new Customer1("Mercy","+2547111"),new Customer1("Mike",
                "+2547161623"),new Customer1("Lee","+542673")};
        FileOutputStream fos = new FileOutputStream("C:/Myjava/Customer.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeInt(list.length);
        for(Customer1 c:list)
            oos.writeObject(c);
        oos.close();
        fos.close();*/
        FileInputStream fis = new FileInputStream("C:/Myjava/Customer.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        int length=ois.readInt();
        Customer1 list[]=new Customer1[length];
        for (int i = 0; i < length; i++) {
            ois.readObject();

        }


    }catch (Exception e){
        System.out.println(e.getMessage());
    }


    }
}
