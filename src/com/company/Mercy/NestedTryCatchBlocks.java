package com.company.Mercy;

public class NestedTryCatchBlocks {
    public static void main(String[] args) {
        try{
            int x[]={1,3,5,2,7,0,4,6,34};
            try{
                for (int i = 0; i < x.length; i++) {
                    int r;
                    r=x[i]/x[i+1];
                    System.out.println(r);
                }

            }
            catch(ArithmeticException e){
                System.out.println("Division by zero error.");
            }
        System.out.println(x[32]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds.");
        }
    }
}
