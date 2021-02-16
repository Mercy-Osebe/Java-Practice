package com.company;
class test{
    static {
        System.out.println("Block test1");
    }
    static {
        System.out.println("Block test2");
    }
}
public class StaticBlock {
    static {
        System.out.println("Block 1");
    }
    public static void main(String[] args) {
        System.out.println("Static blocks get executed first then the main method.");
        System.out.println("The execution of static blocks takes place through class loaders");
        System.out.println("The class must be used so that it can execute the static blocks");

        test t=new test();
        System.out.println("An object is created the class becomes used ie loaded");
    }
    static {
        System.out.println("Block 2");
    }

}
