package Java8.StreamAPI.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StringLengthUsingFilter {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Shiv");
        list.add("Komal");
        list.add("Manu");
        list.add("Sarita");
        list.add("Shubhangi");
        list.add("Nikita");
        list.add("Reshma");
        list.add("Madhura");
        list.add("Radha");
        list.stream().filter((String s)->s.length()>5).forEach(System.out::println);
    }
}
