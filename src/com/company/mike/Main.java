package com.company.mike;

class Test{
    public void override(){
        System.out.println("try");
    }
}
class Test2 extends Test{
    void overriding(){
        System.out.println("trying to override");
    }

}
public class Main {

    static public void main(String[] args) {
        Test t=new Test();
        Test2 t2=new Test2();




    }
}


