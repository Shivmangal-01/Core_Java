package Java8.StreamAPI.Filter;

import java.util.ArrayList;
import java.util.List;

public class TerminationMethods {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(17);
        list.add(20);
        list.add(25);
        list.add(17);
        Integer maxElement=list.stream().max((a,b)->a.compareTo(b)).get();
        System.out.println("Max Element : "+maxElement);
        Integer minElement=list.stream().min((a,b)->a.compareTo(b)).get();
        System.out.println("Minimum Element : "+minElement);

        long count=list.stream().count();
        System.out.println("Count : "+count);
    }
}
