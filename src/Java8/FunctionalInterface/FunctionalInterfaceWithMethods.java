package Java8.FunctionalInterface;
@FunctionalInterface
interface  Interf{
    void greet();
    default  void m1(){
        System.out.println("Default method...");
    }
    static void m2(){
        System.out.println("Static method...");
    }

}
class Test implements Interf{
    @Override
    public void greet() {
        System.out.println("hii");
    }
}
public class FunctionalInterfaceWithMethods{
    public static void main(String[] args) {
        //implementing abstract using lambda
        Interf i=()->{
            System.out.println("Good afternoon");
        };
        i.greet();

        //calling static method
        Interf.m2();

        //calling default method
        new Test().m1();
    }



}
