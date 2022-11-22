package com.tekparams.accessmodifiers;
class test1 {
    String message;
    void printMessage(){
        System.out.println(message);
    }
}
public class Protected_ArithmeticOperationsDemo {
    protected int a;
    protected int b;
    protected int c;

    protected Protected_ArithmeticOperationsDemo(){
        a=100;
        b=400;
    }
    protected void addition(){
        c=a+b;
    }
    protected void printResult(){
        System.out.println("Result is :"+c);
    }
    public static void main(String[] args){
        Protected_ArithmeticOperationsDemo obj1 = new Protected_ArithmeticOperationsDemo();
        obj1.addition();
        obj1.printResult();
        System.out.println();
        obj1.a=600;
        obj1.b=800;
        obj1.addition();
        obj1.printResult();
    }

}
