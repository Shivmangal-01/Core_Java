package Java8.Lambda;
interface Interf{
    void sayHello();
}
public class LambdaDemo {
    public static void main(String[] args) {
        Interf i=()-> System.out.println("hello..");
        i.sayHello();
    }
}
