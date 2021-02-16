package com.company.Mercy;

import com.company.mike.Main;

import java.util.Date;

class Student extends Main {
    private String name;
    private String regNo;
    private String course;
    static int count=1;


    public Student(String name,String course){
        this.name=name;
        this.course=course;

    }
    public void generateRegNo(){

            Date d=new Date();
            System.out.println();
            regNo="BSME/"+(d.getDate()+1990)+"/"+count;
            count++;

    }
    public void intro(){
        System.out.println("My name is "+name+" i am a "+course+"and of regNo: "+regNo);
    }

}

public class AccountStatic {
    public static void main(String[] args) {
        Student s=new Student("Mercy","Mechanical Engineering");
        Student s1=new Student("Mike","Computer Engineering");
        Student s2=new Student("Hope","Civil Engineering");
        s.generateRegNo();
        s.intro();
        s1.generateRegNo();
        s1.intro();
        s2.generateRegNo();
        s2.intro();



    }
}

