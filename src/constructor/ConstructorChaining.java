package constructor;
class Parent{
    Parent(){
        System.out.println("Parent no-argument constructor");
    }
    Parent(String s){
        System.out.println("Parent parameterized constructor");
    }
    Parent(int i){
        System.out.println("Parrent parameterized constructor with int argument");
    }

    public static void main(String[] args) {
        Parent obj=new Parent();
    }
}

public class ConstructorChaining extends Parent {
    ConstructorChaining(){
        System.out.println("child no-argument constructor..");
    }
    ConstructorChaining(String msg){
        super(msg);

        System.out.println("child Parameterized Contructor");

    }
    ConstructorChaining(int i){
        super(10);
        System.out.println("child parameterized constructor with int parameter..");
    }

    public static void main(String[] args) {
        ConstructorChaining obj2=new ConstructorChaining();
        //ConstructorChaining obj=new ConstructorChaining("hey");
        //ConstructorChaining obj1=new ConstructorChaining(10);
    }
}
