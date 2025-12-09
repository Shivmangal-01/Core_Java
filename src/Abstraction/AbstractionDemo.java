package Abstraction;

public class AbstractionDemo {
    void m1(){
        System.out.println("Concrete method");
    }
}
abstract class Demo{
    abstract void m1();
    void display(){
        System.out.println("This is concrete method");
    }
}
