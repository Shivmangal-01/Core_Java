package Java8.FunctionalInterface;
interface  Interf1{
    static  void m1(){
        System.out.println("Staic method in Interf1...");
    }
}
interface Interf2{
    static void m1(){
        System.out.println("static method in Interf2...");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        Interf1.m1();
        Interf2.m1();
    }
}
