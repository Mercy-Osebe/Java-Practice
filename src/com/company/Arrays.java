package com.company;

public class Arrays {
    public static void main(String[]args)
    {
        int x[]={1,2,5,8,1,3,61,7};
        x[3]=10;
        int sum=0;
       System.out.println(" Finding if a number is in an array");
        for(int i=0;i<x.length;i++)
        {
            if(x[i]==9) {
                System.out.println("Yes it's there");
                System.exit(0);
            }

            System.out.println(x[i]);
            sum=sum+x[i];
        }
        System.out.println("The cumulative sum is:"+sum);
        System.out.println("No not found.");


        System.out.println(" Finding the largest and second largest number");
        int max=x[0];
        int max2=x[0];
        for(int i=0;i<x.length;i++)
        {
            if(x[i]>max)
            {
                max2=max;
                max=x[i];
            }
            else if(x[i]>max2)
            {
                max2=x[i];

            }

        }
        System.out.println("The second largest number is:");
        System.out.println(max2+".");
        System.out.println("The largest number is:");
        System.out.println(max+"");

    }


}
