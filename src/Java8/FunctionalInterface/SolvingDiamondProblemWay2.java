package Java8.FunctionalInterface;
interface InterfOne{
    default void sayHello(){
        System.out.println("hello from InterfOne");
    }
}
interface InterfTwo extends InterfOne{
    @Override
    default void sayHello(){
        System.out.println("Hello from InterfTwo");
    }
}
public class SolvingDiamondProblemWay2 implements InterfOne,InterfTwo{
    public static void main(String[] args) {
        new SolvingDiamondProblemWay2().sayHello();
    }
}
