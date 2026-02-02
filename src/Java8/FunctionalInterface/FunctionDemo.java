package Java8.FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer>f=(s)->s.length();
        System.out.println(f.apply("String"));
        System.out.println("------------------------------");
        Function<Integer,Integer>f2=i->i*i*i;
        System.out.println(f2.apply(4));
        System.out.println(f2.apply(5));
        System.out.println("------------------------------");
        Function<String,String>f3=(s)->s.toUpperCase();
        System.out.println(f3.apply("hello"));
        System.out.println("------------------------------");

        //Bifunction
        BiFunction<Integer,Integer,Integer>bf=(a,b)->a+b;
        System.out.println(bf.apply(10,20));
        System.out.println("------------------------------");

        //Unary and Binary operator
        UnaryOperator<Integer>uo=(i)->i*i;
        System.out.println(uo.apply(5));
        UnaryOperator<String>uo1=(s)->s.toUpperCase();
        System.out.println(uo1.apply("java"));
        System.out.println("------------------------------");

        BinaryOperator<Integer>bo=(a,b)->a+b;
        System.out.println(bo.apply(5,10));
    }
}
