package com.company.Mercy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFilesToLowerCase {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("C:/Myjava/Source1.txt");
            byte b[]=new byte[fi.available()];
            fi.read(b);

            String str=new String(b);
            System.out.println(str);
            FileOutputStream fo=new FileOutputStream("C:/Myjava/Source2.txt");
            String st=str.toLowerCase();
            fo.write(st.getBytes());
            fo.close();
            fi.close();

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
