package Polymorphism.MethodOverriding;

//The return type should be the same or a subtype of the return type declared in the original overridden methodin the super class (Covarient return type-object)
class CovarientParent {
    CovarientParent returnobj(){
        CovarientParent obj=new CovarientParent();
        return obj;
    }

}
public class Rule3CovarientReturnType extends CovarientParent {
    @Override
    Rule3CovarientReturnType returnobj(){
//        CovarientParent parent=new CovarientParent();
//        return parent;

        Rule3CovarientReturnType child=new Rule3CovarientReturnType();
        return  child;
    }

}
