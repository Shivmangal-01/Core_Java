package Polymorphism.MethodHiding;
class Parent {
    static void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    static void show() {  // method hiding
        System.out.println("Child show");
    }
}
public class Test {
    public static void main(String[] args) {

        Parent p = new Child();
        p.show();   // Output: Parent show

        Child c = new Child();
        c.show();   // Output: Child show
    }
}
