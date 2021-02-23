package com.company.Practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;

public class ReadCFPractice {
    public static void main(String[] args) {try {
        FileInputStream fis = new FileInputStream("C:/Myjava/Excercise2.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Account a1;
        a1=(Account) ois.readObject();
        Account a2;
        a2=(Account) ois.readObject();
        Account a3;
        a3=(Account) ois.readObject();
        System.out.println(a1.name+" "+a1.generateNum()+" "+a1.balance);





    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
}
