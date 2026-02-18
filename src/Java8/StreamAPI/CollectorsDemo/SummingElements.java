package Java8.StreamAPI.CollectorsDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SummingElements {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        int sum=list.stream().collect(Collectors.summingInt(s->s));
        System.out.println(sum);

        double d=list.stream().collect(Collectors.summingDouble(s->s));
        System.out.println(d);

        long l=list.stream().collect(Collectors.summingLong(s->s));
        System.out.println(l);
    }
}
