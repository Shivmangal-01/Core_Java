package Java8.optionalclasses;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        System.out.println(list);
        List<Integer>li=list.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(li);



    }
}