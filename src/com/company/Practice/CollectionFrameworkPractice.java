package com.company.Practice;
import java.io.*;
import java.sql.SQLOutput;
import java.time.Year;



        class Account implements Serializable{

            String accountNo;
            String name;
            int balance;
            static int acc=1;
            public Account(String name,int balance){
                this.name=name;
                this.balance=balance;
            }
            public String generateNum() {
                String st="Acc/"+name+"/"+acc;
                acc++;
                accountNo=st;
                return accountNo;
            }
            public String toString(){
                return "Name: "+name+"\nAccountNo: "+ generateNum()+"\nBalance: "+balance;
            }

        }

public class CollectionFrameworkPractice {
    public static void main(String[] args) {
                try {
                    FileOutputStream fos = new FileOutputStream("C:/Myjava/Excercise2.txt");
                    ObjectOutputStream oos=new ObjectOutputStream(fos);
                    Account a1 = new Account("Mercy Osebe", 1200);
                    Account a2 = new Account("Mike Makau", 1212);
                    Account a3 = new Account("Lee Mutinda", 120);
                    /*
                    System.out.println(a1);
                    System.out.println("");
                    System.out.println(a2);
                    System.out.println("");
                    System.out.println(a3);

                     */
                    oos.writeObject(a1);
                    oos.writeObject(a3);
                    oos.writeObject(a2);


                    oos.close();
                    fos.close();





                } catch (Exception e) {
                    System.out.println(e.getMessage());

                }
            }
        }

