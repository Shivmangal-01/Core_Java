package Polymorphism.MethodOverriding;
/* Rul6 - A method declared static cannot be overriden. */

/* Method Hiding - In java occurs when a subclass defines a static method with the
exact same signature (method name and parameter list) as a static method in its superclass */

class Rule6Parent{
    static void display(int a,String name){
        System.out.println("Parent class display method...");
    }
}
public class Rule6 extends Rule6Parent{
    //Static methods cannot be annotated with @Override
    //@Override
    static  void display(int a,String name){
        System.out.println("Child class display method");
    }
}
