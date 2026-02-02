package Java8.FunctionalInterface;

import java.util.function.BiPredicate;

public class BipredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> p=(a,b)->a+b>10;
        System.out.println(p.test(10,20));
    }
}
