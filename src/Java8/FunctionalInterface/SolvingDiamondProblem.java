package Java8.FunctionalInterface;
interface Interface1{
    default void m1(){
        System.out.println("hii from Interface1");
    }
}
interface Interface2 extends Interface1{
    default void m1(){
        System.out.println("hii from Interface2");
    }
}
class Testing implements Interface1,Interface2{
    @Override
    public void m1() {
        System.out.println("hii from Class");
    }
}
public class SolvingDiamondProblem {
    public static void main(String[] args) {
        new Testing().m1();
    }
}
