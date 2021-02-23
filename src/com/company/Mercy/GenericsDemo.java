package com.company.Mercy;
class Data<T>{
    private T obj;
    public void setData(T obj){
        this.obj=obj;
    }
    public T getData(){
        return obj;
    }
}
public class GenericsDemo {
    public static void main(String[] args) {
        Data<String> d=new Data<>();
        d.setData("Oh my God.");
        System.out.println(d.getData());
    }
}
