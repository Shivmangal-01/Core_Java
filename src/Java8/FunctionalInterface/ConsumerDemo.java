package Java8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> c=(s)-> System.out.println("Hey "+s);
        c.accept("shiv");

        List<Integer>list= Arrays.asList(2,4,6,45,2,45,32,3,42);
        list.forEach(e-> System.out.print(e+" "));
        System.out.println();

        Consumer<String>firestConsumer=str-> System.out.println("First : "+str);
        Consumer<String>secondConsumer=str-> System.out.println("Second : "+str);
        Consumer<String>combinedConsumer=firestConsumer.andThen(secondConsumer);
        combinedConsumer.accept("java8");
    }
}
