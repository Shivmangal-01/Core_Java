package Java8.StreamAPI.CollectorsDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Counting {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5);
        long count=list.stream().collect(Collectors.counting());
        System.out.println(count);

    }
}
