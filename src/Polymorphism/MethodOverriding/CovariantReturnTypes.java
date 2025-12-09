package Polymorphism.MethodOverriding;

public class CovariantReturnTypes {
    void test(){

    }
    int add(){
        return 100;
    }
    //object class is a parent class of each class in java
    //can a method returns an object of a class
    String retunString(){
        String s=new String("java");
        return s;
    }

    CovariantReturnTypes returnObj(){
        CovariantReturnTypes obj=new CovariantReturnTypes();
        return obj;
    }
}
