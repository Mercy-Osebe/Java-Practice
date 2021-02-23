package com.company;

import java.util.Date;

class Student3{
    private String rollNumber;
    private static int count=1;
    private String generateRollNumber(){
        //create object of class date
        Date d=new Date();
        String rn="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return  rn;

    }
    public Student3(){
        rollNumber=generateRollNumber();

    }
    public String getRollNumber(){
        return rollNumber;
    }
}


public class GeneratingRollNumber {
    public static void main(String[] args) {
        Student3  s1=new Student3();
        Student3  s2=new Student3();
        Student3  s3=new Student3();
        Student3  s4=new Student3();
        System.out.println(s1.getRollNumber());
        System.out.println(s2.getRollNumber());
        System.out.println(s3.getRollNumber());
        System.out.println(s4.getRollNumber());

    }
}
