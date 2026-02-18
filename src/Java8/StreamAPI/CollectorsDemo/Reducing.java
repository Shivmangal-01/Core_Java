package Java8.StreamAPI.CollectorsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Reducing {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5);
        int sum=list.stream().collect(Collectors.reducing(0,(a,b)->a+b));
        System.out.println(sum);
    }
}
