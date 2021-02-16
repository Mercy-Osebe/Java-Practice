package com.company;

public class VariableArguments {
    static int max(int ...a)
    {
        int first=a[0];
        System.out.println("The numbers are:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
            if(first<a[i])
            {
                System.out.println(a[i]);
                first=a[i];
            }

        }
        System.out.println("The maximum of the numbers is:");
        return first;
    }

    static int sum(int ...b) {
        int add = 0;
        for (int i = 0; i < b.length; i++) {

            add = add + b[i];
        }
        System.out.println("The sum of the numbers is:");
        System.out.println(add);

        float discount=0;
        if(add>1000)
        {
            discount=0.1f*add;
            System.out.println("Discount given is:"+discount);
        }
        else if(add>500&& add<1000)
        {
            discount=0.05f*add;
            System.out.println("Discount given is:"+discount);
        }
        else
        {
            System.out.println("no discount was given since you haven't met the discount thresh-hold");
        }
        return add;


    }
    public static void main(String[] args) {
        int x[]={12,30,5,700,3,8,8,5,3,9,410,4,6};
            //VariableArguments b=new VariableArguments();
           max(x);
           sum(x);
    }
}
