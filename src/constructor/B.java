package constructor;
class A{
    A(){
        System.out.println("No-Argument Constructor");
    }
    A(int a,int b){
        System.out.println("Parameterized constructor");
        System.out.println("Sum :"+ (a+b));
    }
}
public class B extends A{
    B(){
        //super()  //no need to write bcoz jvm add it automatically
        System.out.println("Child-No Argument Constructor");
    }
    B(int a,int b){
        super(10,20);
        System.out.println("Child-parameterized constructor");
        System.out.println("Subtraction :"+(a-b));
    }

    public static void main(String[] args) {
        B obj=new B();
        B obj2=new B(20,15);
    }
}
