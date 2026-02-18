package Java8.StreamAPI.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {
    public static void main(String[] args) {
        List<Integer > list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(10);
        list.add(2);
        list.add(10);
        list.add(20);
        list.add(25);
        //creating stream of unique even numbers
        list.stream()
                .filter(i->i%2==0)
                .distinct()
                .forEach(e-> System.out.println(e));







    }
}
