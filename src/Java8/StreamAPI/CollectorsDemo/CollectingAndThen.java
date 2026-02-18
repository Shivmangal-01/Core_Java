package Java8.StreamAPI.CollectorsDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectingAndThen {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("A","B","C");
        List<String > unmodifiableList=list.stream().collect(Collectors.collectingAndThen(Collectors.toList(),Collections::unmodifiableList));
        System.out.println(unmodifiableList);
    }
}
