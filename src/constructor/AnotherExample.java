package constructor;
class  Example{
//    Example(){
//        System.out.println(" Parent-No-Argument constructor");
//    }
    public Example(String s){
        System.out.println("Parent- parameterized  Constructor");
        System.out.println("String : "+ s);
    }
}
public class AnotherExample extends Example {
   AnotherExample(int a,int b){
        super("Hey");
        System.out.println("Child-Parameterized constructor");
        System.out.println("Sum : "+(a+b));
    }

    public static void main(String[] args) {
        AnotherExample obj=new AnotherExample(10,40);
    }
}
