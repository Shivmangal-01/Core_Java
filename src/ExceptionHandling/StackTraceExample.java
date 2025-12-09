package ExceptionHandling;

public class StackTraceExample {
    public static void main(String[] args) {
        A();   // calling A()
    }

    static void A() {
        B();   // calling B()
    }

    static void B() {
        C();   // calling C()
    }

    static void C() {
        int x = 10 / 0;   // ArithmeticException: divide by zero
    }
}
