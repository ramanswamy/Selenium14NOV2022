package com.tekparams.accessmodifiers;

public class Private_ArithmeticOperationsDemo {
    private int a;
    private int b;
    private int c;


    private Private_ArithmeticOperationsDemo(){
        a=100;
        b=400;
    }
    private void addition(){
        c=a+b;
    }
    private void printResult(){
        System.out.println("Result is :"+c);
    }
    public static void main(String[] args){
        Private_ArithmeticOperationsDemo obj1 = new Private_ArithmeticOperationsDemo();
        obj1.addition();
        obj1.printResult();
        System.out.println();
        obj1.a=600;
        obj1.b=800;
        obj1.addition();
        obj1.printResult();
    }



}
