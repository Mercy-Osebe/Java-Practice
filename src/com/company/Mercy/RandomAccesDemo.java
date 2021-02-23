package com.company.Mercy;

import java.io.RandomAccessFile;

public class RandomAccesDemo {
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf=new RandomAccessFile("C:/Myjava/Source1.txt","rw");
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        raf.write('a');
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        raf.skipBytes(2);
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
    }
}
