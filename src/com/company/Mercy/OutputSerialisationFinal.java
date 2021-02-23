package com.company.Mercy;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Pupil implements Serializable {
    int regNo;
    String name;
    String dept;
    static int data=10;
    public Pupil(){}
    public String toString(){
        return "Pupil name:"+name+"\nDept name:"+dept+"\nRegNo:"+regNo+"\nData:"+data;
    }
}


public class OutputSerialisationFinal {
    public static void main(String[] args) {
        try{
        FileOutputStream fos=new FileOutputStream("C:/Myjava/My.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            Pupil p=new Pupil();
            p.regNo=1372;
            p.name="Victor";
            p.dept="HighSchool";
            oos.writeObject(p);
            fos.close();
            oos.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
