public class MethodOverloadingDemo {
    public int result;

    void add(){
        System.out.println(10+20);
    }
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void add(int a, float b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        MethodOverloadingDemo obj1 = new MethodOverloadingDemo();
        obj1.add(10,30,50);
        obj1.add(45,89.5f);
    }

}
