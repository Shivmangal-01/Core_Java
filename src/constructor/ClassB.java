package constructor;

public class ClassB {
    public static void main(String[] args) {
        ClassA obj=new ClassA();
        obj.meth1();
        //ClassA obj2=new ClassA("Shiv"); // error becoz this constructor is private
    }
}
