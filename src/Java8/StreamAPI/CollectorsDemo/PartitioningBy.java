package Java8.StreamAPI.CollectorsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//partitioningBy()- divided the elements into exactly two groups based on boolean expression (True and False) it takes predicate.
public class PartitioningBy {
    public static void main(String[] args) {
        List<Integer>list=List.of(1,2,3,4,5,6,10);
        Map<Boolean,List<Integer>> map=list.stream().collect(Collectors.partitioningBy(i->i%2==0));
        System.out.println(map);

    }
}
