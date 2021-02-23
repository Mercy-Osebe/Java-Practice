package com.company.Mercy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:/Myjava/Text.txt");
            String str = "Learning java programming is a game changer.\n This is my first OutputStream";
            fos.write(str.getBytes());
            fos.close();
            System.out.println(str);
        }
        catch(FileNotFoundException e){
            System.out.println( e.getMessage());
        }
        catch(IOException io){
            System.out.println(io.getMessage());
        }


    }
}
