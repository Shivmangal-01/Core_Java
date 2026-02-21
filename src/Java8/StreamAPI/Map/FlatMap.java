package Java8.StreamAPI.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2,3);
        List<Integer>list2=Arrays.asList(4,5,6);
        List<Integer>list3=Arrays.asList(7,8,9);

        List<List<Integer>>list=new ArrayList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        System.out.println(list);

        //flatten list
        List<Integer>flattenList=list.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flattenList);

        List<Integer>flattenList2=list.stream().flatMap(i->i.stream()).collect(Collectors.toList());
        System.out.println(flattenList2);
    }
}
