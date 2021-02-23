package com.company.Mercy;

import java.io.*;

public class TwoFilesOneCopy {
    public static void main(String[] args) {
        try {
            FileInputStream f1 = new FileInputStream("C:/Myjava/Source1.txt");
            FileInputStream f2=new FileInputStream("C:/Myjava/Source2.txt");

            FileOutputStream fo=new FileOutputStream("C:/Myjava/Copy.txt");
            SequenceInputStream se=new SequenceInputStream(f1,f2);
            int b;while((b=se.read())!=-1){
                fo.write(b);
            }
            se.close();
            f1.close();
            f2.close();
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
