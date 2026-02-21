package Java8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.function.*;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        //Create a Predicate<Integer> that checks whether a number is even.
        Predicate<Integer> p=(a)->a%2==0;
        System.out.println(p.test(10));
        System.out.println( p.test(7));


        //Filter numbers greater than 10 AND divisible by 3.
        //Print the filtered list.
        List<Integer> list = Arrays.asList(5, 12, 18, 7, 25, 30);
        List<Integer> resList=list.stream().filter(a->a>10 && a%3==0).collect(Collectors.toList());
        System.out.println(resList);

//        Predicate<Integer> p1 = a -> a > 10;
//        Predicate<Integer> p2 = a -> a % 3 == 0;

        //Create a Function<String, Integer> that returns the length of a string.
        Function<String,Integer>f=a->a.length();
        System.out.println(f.apply("Java8"));

        //Create two functions:
        //Convert string to uppercase
        //Add "!!!" at the end
        //Use andThen() to combine them.

        Function<String ,String> f1=a->a.toUpperCase();
        Function<String,String>f2=a->a+"!!!";
        String res=f1.andThen(f2).apply("Hello");
        System.out.println(res);

//        Print: Welcome <name>
//        Then: Have a nice day!
        Consumer<String>c1=name-> System.out.println("Welcome "+name);
        Consumer<String>c2=msg-> System.out.println("Have a nice day ! ");
        c1.andThen(c2).accept("Shiv");
        System.out.println("===================================");

        //Supplier (Random 1–100)
        Supplier<Integer> supplier = () ->
                (int)(Math.random() * 100) + 1;

        for (int i = 0; i < 5; i++) {
            System.out.println(supplier.get());
        }
        System.out.println("===================================");

        //unary operator -Multiple each number by 10
        List<Integer> list1 = Arrays.asList(5, 12, 18, 7, 25, 30);
        UnaryOperator<Integer>u=a->a*10;
        List<Integer>updated=list1.stream().map(u).collect(Collectors.toList());
        System.out.println(updated);
        System.out.println("===================================");

        //BinaryOperator (Find Maximum)
        BinaryOperator<Integer>bo=(a,b)->a>b?a:b;
        System.out.println("Max : "+bo.apply(10,20));
        System.out.println("===================================");

        //finding minimum
        BinaryOperator<Integer>min=(a,b)->a<b?a:b;
        System.out.println("Min : "+min.apply(10,20));
        System.out.println("===================================");

        //Requirement:
        //Return: "Name: Shiv, Age: 23"

        BiFunction <String,Integer,String>out=(name,age)->"Name : "+name+" Age : "+age;
        System.out.println(out.apply("Shiv",24));



//        Length > 3
//        Convert to uppercase
//        Collect into list
        List<String> names =Arrays.asList("Ram", "Shiv", "Anu", "Kiran", "Om");
        Predicate<String>nameLength=(name)-> name.length()>3;
        Function<String,String>upper=s->s.toUpperCase();
        List<String>resultList=names.stream().filter(nameLength).map(upper).collect(Collectors.toList());
        System.out.println(resultList);








    }
}
