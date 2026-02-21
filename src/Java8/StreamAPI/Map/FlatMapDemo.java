package Java8.StreamAPI.Map;

import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {
        Stream<List<String>>streamOfString=Stream.of(List.of("Java","Python"),
                List.of("Spring","SpringBoot"),
                List.of("Hibernate","java8"));

        //streamOfString.forEach(System.out::print);

        Stream<String> flattenStream=streamOfString.flatMap(List::stream);
        flattenStream.forEach(System.out::println);

    }
}
