package com.company.Mercy;
@SuppressWarnings("unchecked")
class MyArray<T,I>{
    T A[]=(T[])new Object[10];
    int length=0;
    public void append(T v){
        A[length++]=v;
            }
    public void display()
    {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);

        }
    }
}

public class GenericsArray {
    public static void main(String[] args) {
        MyArray <String,Integer>ma=new MyArray<>();
        ma.append("Mercy");
        ma.append("is");
        ma.append("dope.");
        //ma.append(10);
        ma.display();

    }
}
