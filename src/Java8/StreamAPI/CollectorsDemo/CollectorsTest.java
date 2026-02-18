package Java8.StreamAPI.CollectorsDemo;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsTest {
    public static void main(String[] args) {
        //toList()- collect elements into list (maintain insertion order and allows duplicates).
        List<Integer>list= List.of(1,20,34,14,5,2,5);
        List<Integer> toList=list.stream().collect(Collectors.toList());
        System.out.println(toList);

        //getting unique elements
        List<Integer>uniqueElements=list.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueElements);
        System.out.println(uniqueElements.size());

    }
}
