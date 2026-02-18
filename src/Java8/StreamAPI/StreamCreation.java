package Java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {

        //creating empty stream
        Stream<Integer>  emptyStream=Stream.empty();
        System.out.println(emptyStream.count());
        System.out.println("===================================");

        //creating stream using stream.of()
        Stream.of(1,2,3,4,5).forEach(System.out::println);
        System.out.println("===================================");

        //creating stream from collection

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.stream().forEach(System.out::println);
    }
}
