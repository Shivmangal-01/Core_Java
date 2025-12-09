package Abstraction;

public class AbstractClassRules {
     //Rule3  We can not create an object of abstract class.
   //AbstractRule1 obj=new AbstractRule1() ;//C.E  AbstractRule1 can not be instantiated
}

abstract  class AbstractRule1{
    //Rule-1   It's not mandatory to have abstract method in abstract class

    void m1(){ //non-abstract method

    }
    abstract void m2();//abstract method
}

abstract class AbstractRul2{
    //Rule-2   If we define any abstract method in a class then that class must be a abstract class
    abstract void m1();
}

abstract  class Rule3{
    int a;
    String s;
    Rule3(){
        System.out.println("Constructor of a abstract class");
    }
    //Rule-3  Even when we cannot create object of abstract class then also we can write constructor in abstract class
    //bcoz- whenever we inherit abstract class and child class object created then abstract class constructor gets called.
}
