package Java8.StreamAPI.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(50);
        list.add(70);
        list.add(100);
        Stream<Integer>stream=list.stream().filter(i->i>=50);
        stream.forEach(System.out::println);
    }
}
