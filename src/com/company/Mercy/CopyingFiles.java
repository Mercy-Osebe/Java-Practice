package com.company.Mercy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFiles {
    public static void main(String[] args) {
        try {
            FileOutputStream fo = new FileOutputStream("C:/Myjava/Source1.txt");
            String str="I WANT TO COPY THIS FILE.";
            fo.write(str.getBytes());
            fo.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
