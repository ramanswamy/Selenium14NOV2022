package com.tekparams.accessmodifiers;

public class Public_ArithmeticOperationsDemo {
    public int a;
    public int b;
    public int c;


    public Public_ArithmeticOperationsDemo(){
        a=100;
        b=400;
    }
    public void addition(){
        c=a+b;
    }
    public void printResult(){
        System.out.println("Result is :"+c);
    }
    public static void main(String[] args){
        Default_ArithmeticOperationsDemo obj1 = new Default_ArithmeticOperationsDemo();
        obj1.addition();
        obj1.printResult();
        System.out.println();
        obj1.a=600;
        obj1.b=800;
        obj1.addition();
        obj1.printResult();
    }

}
