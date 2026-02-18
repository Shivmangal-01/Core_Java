package Java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WhyStreams {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("ABCD");
        list.add("BCD");
        list.add("RABCD");
        list.add("ABCD");
        list.add("ABCD");
        list.add("APBCD");
        list.add("LABCD");
        list.add("CABCD");
        list.add("ABCD");

        //get all elements which starts with char A and give me the count -- Using collection
//        int count=0;
//        for(String s:list){
//            if(s.startsWith("A")){
//                count++;
//                System.out.println(s);
//            }
//        }
//        System.out.println("count of all list elements which are starts with A : "+count);

        //get all elements which starts with char A and give me the count -- Using stream
//        list.stream().filter(a->a.startsWith("A")).forEach(System.out::println);
//        long count=list.stream().filter(a->a.startsWith("A")).count();
//        System.out.println(count);

        long count=list.stream().filter(a->a.startsWith("A")).peek(System.out::println).count();
        System.out.println(count);

    }
}
