package ExceptionHandling;

public class StackTraceExample2 {
    void m1(){
        System.out.println("m1() called");
        m2();//m2() called
    }
    void m2(){
        System.out.println("m2() called");
        m3(); //m3() called
    }
    void m3(){
        System.out.println("m3() called");
        int a= 10/0; //Exception
    }
    public static void main(String[] args) {
        StackTraceExample2 obj=new StackTraceExample2();
        obj.m1(); //m1() called
    }
}
