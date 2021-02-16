package com.company;
public class Practise_arrays {
    public static void main(String[]args)
    {
        int a[]={8,6,10,9,2,15,7,13,14,11};
        int b[]=new int[10];
        for(int x=a.length-1,j=0;x>=0;x--,j++) {
            b[j]=a[x];

        }
        for (int j = 0; j <a.length ; j++) {
            System.out.print(b[j]+",");

        }



        /*int x[]=new int[10];
        x[0]=5;x[1]=4;x[2]=6;x[3]=8;x[4]=7;x[5]=9;
        int n=6;
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+",");
        }
        System.out.println("");
        int replace=71;
        int index=4;
        for (int i = n; i >index ; i--)
        {
            x[i]=x[i-1];
        }
        x[index]=replace;
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+",");
        }

         */


    }

}
