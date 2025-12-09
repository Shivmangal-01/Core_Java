package Polymorphism.MethodOverriding;

//Return type must be same for both parent and child class method
class Rule3Parent{
    int add(){
        return 100;
    }
}
public class Rule3 extends Rule3Parent {
    int add(){
        return 101;
    }

}
