package Java8.Lambda;
abstract class Test{
    abstract void m1();
}
public class AnonymousClass {
    public static void main(String[] args) {
        Test t=new Test() {
            @Override
            void m1() {
                System.out.println("Abstract class implementaion using anonymous class...");
            }
        };
        t.m1();
    }
}
