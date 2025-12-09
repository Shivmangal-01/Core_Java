package Methods;

public class NestedMethodNotAllowed {
    void m1(){
        System.out.println("Outer Method...");
//        void m2(){
//            System.out.println("Inner Method...");
//        } //C.E Nested method not allowed in java
    }

    public static void main(String[] args) {
        NestedMethodNotAllowed obj=new NestedMethodNotAllowed();
        obj.m1();
    }
}
