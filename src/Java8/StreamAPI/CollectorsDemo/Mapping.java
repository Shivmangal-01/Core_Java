package Java8.StreamAPI.CollectorsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mapping {
    public static void main(String[] args) {
        List<String>cities= Arrays.asList("Mumbai","Java","Java8","Hibernate","Spring","SpringBoot");
        Map<Character,List<String>> gp=cities.stream().collect(Collectors.groupingBy(a->a.charAt(0)));
        System.out.println(gp);

        Map<Character,List<Integer>> len=cities.stream().collect(Collectors.groupingBy(name->name.charAt(0),Collectors.mapping(String::length,Collectors.toList())));
        System.out.println(len);


    }
}
