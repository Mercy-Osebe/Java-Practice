package com.company;

public class Method_practice {
    static String userName(String email)
    {
        int a=email.indexOf('@');
        String name=email.substring(0,a);
        System.out.println("My name is:"+name);
        return name;
    }

    public static void main(String[] args) {
        String str = new String("marcynyaata@gmail.com");
        userName(str);

    }




    /*static void update(int y[]){
       y[0]=12;
    }


    public static void main(String[] args) {
        int x[]={2,3,4,5,6};
        update(x);
        for (int i = 0; i <x.length ; i++) {
            System.out.print(x[i]+",");
        }

    }
    static int max(int x,int y)
    {
        if(x>y){
            return x;
        }
          return y;



    }

    public static void main(String[] args) {
        int a=5,b=7,c;
        c=max(a,b);
        System.out.println(c+":is the max value now");

    }

     */
}
