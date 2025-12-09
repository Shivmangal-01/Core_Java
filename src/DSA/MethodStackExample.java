package DSA;

public class MethodStackExample {
    void A() {
        System.out.println("Inside A()");
        B();   // calling B()
    }

    void B() {
        System.out.println("Inside B()");
        C();   // calling C()
    }

    void C() {
        System.out.println("Inside C()");
        int x = 10;      // local variable
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        MethodStackExample obj = new MethodStackExample();
        obj.A();    // starting point
    }
}
