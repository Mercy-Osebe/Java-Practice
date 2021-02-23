package com.company.Mercy;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class InputSerialisationFinal {
    public static void main(String[] args) {try {
        FileInputStream fis = new FileInputStream("C:/Myjava/My.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Pupil p=(Pupil)ois.readObject();
        System.out.println(p);
        fis.close();
        ois.close();



    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
}
