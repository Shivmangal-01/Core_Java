package Java8.FunctionalInterface;
interface Tripredicate<T,U,V>{
    boolean test(T t,U u,V v);
}
public class TriPredicateTest {
    public static void main(String[] args) {
        Tripredicate<Integer,Integer,Integer>p=(a,b,c)->a+b+c>50;
        System.out.println(p.test(10,40,50));
    }
}
