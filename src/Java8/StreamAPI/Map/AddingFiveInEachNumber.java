package Java8.StreamAPI.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddingFiveInEachNumber {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5);
        list.stream().map(a->a+5).forEach(e-> System.out.println(e));

        List<Integer> result=list.stream().filter(a->a%2==0).map(a->a+10).collect(Collectors.toList());
        System.out.println(result);
    }
}
