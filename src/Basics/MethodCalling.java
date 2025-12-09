package Basics;

public class MethodCalling {
    void meth1(){
        System.out.println("meth1() called...");
    }

    public static void main(String[] args) {
        System.out.println("Start");
        MethodCalling obj=new MethodCalling(); //object creation
        obj.meth1();  //method calling ---method is called using object of that respective class
        System.out.println("End");
    }
}
