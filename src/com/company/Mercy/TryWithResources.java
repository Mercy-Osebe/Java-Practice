package com.company.Mercy;

import java.io.FileInputStream;

public class TryWithResources  {
    static void show() throws Exception{
        FileInputStream fi;
           fi = new FileInputStream("C:/Users/admin/Desktop/Tropical Heat Simulation Excercises.txt");
            System.out.println(fi);


    }
    public static void main(String[] args) {
        try {
            show();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
