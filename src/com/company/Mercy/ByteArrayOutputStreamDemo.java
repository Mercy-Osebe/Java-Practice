package com.company.Mercy;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bos=new ByteArrayOutputStream(10);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.write('e');
        bos.write('f');
        byte b[]=bos.toByteArray();
        for (int x:b) {
            System.out.print((char)x);
        }
        bos.writeTo(new FileOutputStream("C:/Myjava/ByteArray.txt"));
        bos.close();
    }
}
