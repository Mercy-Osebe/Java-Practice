package com.company.Mercy;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class MyReadObjSerialisation {
    public static void main(String[] args) {
        try{
        FileInputStream fis=new FileInputStream("C:/Myjava/ObjSerialisation1.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        Student1 s1=new Student1();
        s1.rollNo=Integer.parseInt(br.readLine());
        s1.name=br.readLine();
        s1.dept=br.readLine();
            System.out.println("i am "+s1.name+" of dept: "+s1.dept+" and RollNo: "+s1.rollNo);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
