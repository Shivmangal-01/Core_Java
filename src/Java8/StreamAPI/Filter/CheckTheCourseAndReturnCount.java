package Java8.StreamAPI.Filter;

import java.io.OutputStreamWriter;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckTheCourseAndReturnCount {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("AWS");
        list.add("SQL");
        list.add("Azure");
        long count =list.stream()
                .filter(s->s.length()==3)
                .count();
        System.out.println("Count is : "+count);

        List<String> sortedListAsc=list.stream()
                                       .sorted()
                                       .collect(Collectors.toList());
        System.out.println(sortedListAsc);

        List<String>sortedListDesc=list.stream()
                .sorted((a,b)->b.compareTo(a))
                .collect(Collectors.toList());
        System.out.println(sortedListDesc);




    }
}
