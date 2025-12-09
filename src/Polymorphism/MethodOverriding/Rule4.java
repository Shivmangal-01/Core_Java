package Polymorphism.MethodOverriding;

/*  Rule4 - The access level cannot be more restrictive than the parent class methods access level. */
class Rule4Parent{
    void show(){
        System.out.println("Parent class method");
    }

}
public class Rule4  extends Rule4Parent{
    @Override
    //if i made it private then it thorows error
    //i have to increase the accessiability means if i have private then i can give public , protected ,default in subclass
    //default (parent)====> public,protected
    void show() {
        System.out.println("Child class method");
    }
}
