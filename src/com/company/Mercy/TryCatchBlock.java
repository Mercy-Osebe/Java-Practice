package com.company.Mercy;

public class TryCatchBlock {
    public static void main(String[] args) {
        try {
            int x[]= {5,3,5,0,8,6};
            int r;
            for (int i = 0; i < x.length; i++) {
               r=x[i]/x[i+1];
                System.out.println(r);


            }
            System.out.println(x[8]);

        }
        catch(ArithmeticException e){
            System.out.println("Zero division error");

        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array index out of bounds.");
        }
    }
}
