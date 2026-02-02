package Java8.FunctionalInterface;
//interface which contains only one abstract method is called functional interface
@FunctionalInterface
interface MyInterface{
    int sum(int a,int b);

}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        MyInterface m=(a,b)->a+b;
        System.out.println(m.sum(5,10));

    }
}
