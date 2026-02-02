package Java8.FunctionalInterface;
interface  InterfaceOne{
    default  void show(){
        System.out.println("hii from InterfaceOne...");
    }
}
interface  InterfaceTwo{
    default void show(){
        System.out.println("Hii from InterfaceTwo...");
    }
}
public class DefaultMethod implements InterfaceOne,InterfaceTwo{
    @Override
    public void show() {
        InterfaceTwo.super.show();
    }

    public static void main(String[] args) {
        new DefaultMethod().show();
    }
}
