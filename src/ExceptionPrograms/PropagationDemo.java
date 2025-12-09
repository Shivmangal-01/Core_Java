package ExceptionPrograms;

import java.io.IOException;

public class PropagationDemo {
    void m1(){
        System.out.println("m1() called");
//        try{
//            m2();
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        }
        m2();
        System.out.println("m1() complete");
    }
    void m2() throws ArithmeticException {
        System.out.println("m2() called");
        try{
            m3();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("m2() complete");
    }
    void m3() {
        System.out.println("m3() called");
        System.out.println(10/0);
        System.out.println("m3() complete");
    }

    public static void main(String[] args) {
        PropagationDemo obj= new PropagationDemo();
        obj.m1();
    }
}
