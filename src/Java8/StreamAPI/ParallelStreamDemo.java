package Java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Java");
        list.add("Java8");
        list.add("SQL");
        list.add("Hibernate");
        list.add("Spring");

        //normal stream
        list.stream().filter((String name)->name.length()>5).forEach(System.out::println);
        System.out.println("====================================");

        //parallel stream
        list.parallelStream().filter((String name)->name.length()>4).forEach(System.out::println);
    }
}
