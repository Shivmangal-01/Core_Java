package constructor;
class Parent1{
    Parent1(){
        System.out.println("no-argument parent constructor");
    }
}

public class ConstructorThisAndSuper  extends Parent1{
    ConstructorThisAndSuper(){
        super();
        //this();
        System.out.println("Child class no-argument constructor..");
    }

    public static void main(String[] args) {
        new ConstructorThisAndSuper();
    }
}
