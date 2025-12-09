package ExceptionHandling;

public class DemoNullPointer {
    void m1(){
        System.out.println("M1() called");
    }
    public static void main(String[] args) {
        DemoNullPointer obj=null;
        obj.m1();
    }
}
