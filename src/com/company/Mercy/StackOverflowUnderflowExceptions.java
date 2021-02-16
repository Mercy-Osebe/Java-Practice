package com.company.Mercy;


class StackOverFlow extends Exception{
    public String toString(){
        return "Stack overflow error: Stack is full";
    }
}
class StackUnderFlow extends Exception{
    public String toString(){
        return "Stack underflow error:Stack is empty";
    }
}
class Stack{
    private int size;
    private int top=-1;
    private int s[];
    public Stack(int sz){
        size=sz;
        s=new int[sz];
    }

    public void push(int x)throws StackOverFlow{
        if (top==size-1)
            throw new StackOverFlow();

        top++;
        s[top]=x;


    }
    public int pop()throws StackUnderFlow{
        int x=-1;
        if(top==-1)
        throw new StackUnderFlow();
        x=s[top];
        x--;
        return x;
    }
}

public class StackOverflowUnderflowExceptions {
    public static void main(String[] args) {
        Stack s=new Stack(1);
        try {
            s.pop();

        }

        catch(StackUnderFlow su){
            System.out.println(su);
        }

    }
}
