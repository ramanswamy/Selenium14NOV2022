package com.tekparams.OOPS;

import com.tekparams.accessmodifiers.Protected_ArithmeticOperationsDemo;

public class Inheritance_Demo extends Protected_ArithmeticOperationsDemo {
    public String message;

    void pritnMessage(){
        System.out.println(message);
    }
    public static void main(String[] args){
        Inheritance_Demo obj1 = new Inheritance_Demo();
        obj1.message="Hi";
        obj1.pritnMessage();
        System.out.println();
        obj1.addition();
        obj1.printResult();
    }

}
