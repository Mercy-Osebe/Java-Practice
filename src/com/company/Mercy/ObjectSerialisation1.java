package com.company.Mercy;

import java.io.FileOutputStream;
import java.io.PrintStream;

class Student1{
    int rollNo;
    String name;
    String dept;
}

public class ObjectSerialisation1 {
    public static void main(String[] args) {try {
        FileOutputStream fos = new FileOutputStream("C:/Myjava/ObjSerialisation1.txt");
        PrintStream ps=new PrintStream(fos);
        Student1 s1=new Student1();
        s1.rollNo=10;
        s1.name="Mercy";
        s1.dept="Mechanical Engineering";
        System.out.println("i am "+s1.name+" of dept: "+s1.dept+" and RollNo: "+s1.rollNo);
        ps.println(s1.rollNo);
        ps.println(s1.name);
        ps.println(s1.dept);

    }catch(Exception e){
        System.out.println(e.getMessage());
    }

    }
}
