package Inheritance;
class Parent{
    Parent(){
        System.out.println("parent class constructor..(Non-parameterized)");
    }
    void m1(){
        System.out.println("Parent class method...");
    }
}
public class SingleLevelDemo extends Parent{
    public static void main(String[] args) {
        SingleLevelDemo obj=new SingleLevelDemo();
        obj.m1();
    }
}
