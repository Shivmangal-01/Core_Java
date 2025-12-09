package Polymorphism.MethodOverriding;
class Parent{
    int add(int a,int b){
        return a+b;
    }

}
public class IntroToOverriding extends Parent{
    @Override
    int add(int a, int b) {
        return a+b+10;
    }
}
