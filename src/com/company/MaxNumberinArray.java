package com.company;

public class MaxNumberinArray {
    static int max(int a[]){
        int maximum=a[0];
        for (int i=0;i<a.length;i++) {


            if(a[i]>maximum)

            {
               maximum=a[i];
            }
        }

     return maximum;
    }



    public static void main(String[] args) {
        int x[]={2,4,3,1,5,12,7,8,9,11};
        int c=max(x);
        System.out.println(c);

    }
}
