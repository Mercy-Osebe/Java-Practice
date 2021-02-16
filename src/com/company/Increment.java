package com.company;

import java.util.Locale;

public class Increment {
    public static void main(String[] arg)
    {
        String str="    My love  ";
        String str1=str.toLowerCase();
        String str2=str.toUpperCase();
        String str3=str.replace("love","baby");
        String str4=str3.trim();
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str4.indexOf('b'));
        System.out.println(str4.lastIndexOf('y'));
        System.out.println(str4.startsWith("My"));
        System.out.println(str4.substring(1,5));
        System.out.println(str4.charAt(1));


    }
}

