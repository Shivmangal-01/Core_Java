package Java8.StreamAPI.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //System.out.println(list);
        List<Integer>sortedListAsc=list.stream().sorted().collect(Collectors.toList());

        System.out.println("Ascending order : "+sortedListAsc);

        List<Integer>sortedListDesc=list.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        System.out.println("Descending Order : "+sortedListDesc);
    }
}
