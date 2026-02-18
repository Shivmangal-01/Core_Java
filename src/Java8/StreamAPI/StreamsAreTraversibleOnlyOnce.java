package Java8.StreamAPI;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Stream;

public class StreamsAreTraversibleOnlyOnce {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream=list.stream();
        stream.forEach(System.out::println);
        //stream.forEach(System.out::println);
    }
}
