package com.company.Mercy;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
public class FloatOtputInput {
    public static void main(String[] args) {try {
/*
        float list[]={13f,1.4f,3.5f,26.4f,7.8f};
        FileOutputStream fos = new FileOutputStream("C:/Myjava/Data.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeInt(list.length);
        for(float f:list){
            dos.writeFloat(f);
        }

        dos.close();
        fos.close();*/
        FileInputStream fis = new FileInputStream("C:/Myjava/Data.txt");
        DataInputStream dis=new DataInputStream(fis);
        int length=dis.readInt();
        float data;
        for (int i = 0; i < length; i++) {
            data=dis.readFloat();
            System.out.println(data);

        }
        dis.close();
        fis.close();

        }catch(Exception e){
        System.out.println(e.getMessage());
    }

    }
}
