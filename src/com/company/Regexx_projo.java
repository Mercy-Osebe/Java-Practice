package com.company;

public class Regexx_projo {
    public static void main(String[]arg)
    {
       /*String str="programmer@mmail.com";
        int ofAt=str.indexOf('@');
       String username=str.substring(0,ofAt);
       String domainame=str.substring(ofAt+1);
       System.out.println("The user name is:" + username);
        System.out.println("The domain name is:" + domainame);
        System.out.println("This is a gmail account?:" + domainame.startsWith("gmail"));
        */
        int x= 10001111;
        String num=(x+"");
        System.out.println(num.matches("[01]*"));

        String st="128c6ad";
        System.out.println(st.matches("\\w+"));
        System.out.println(st.matches("[a-zA-Z0-9]*"));

        String date="12/03/2996";
        System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[2][0-9]{3}"));

        String m="men23@#chi     %&zede(c";
        System.out.println(m.replaceAll("[^a-zA-Z0-9]",""));
        System.out.println(m.replaceAll("[^a-zA-Z]",""));
        //System.out.println(m.)






    }
}
