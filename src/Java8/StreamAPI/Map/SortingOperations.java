package Java8.StreamAPI.Map;

import java.util.ArrayList;
import java.util.List;

public class SortingOperations {
    public static void main(String[] args) {
        List<String>names=new ArrayList<>();
        names.add("Shiv");
        names.add("Shivmangal");
        names.add("Vishu");
        names.add("Vishranti");
        names.add("Shiva");
        names.add("Shiv");
        names.add("Komal");
        //sorting names by natural sorting order
        names.stream().sorted().forEach(System.out::println);

        System.out.println("==============================");

        //sorting names based on their length
        names.stream().sorted((String name1,String name2)->name1.length()-name2.length()).forEach(System.out::println);

        System.out.println("===============================");
        names.stream().distinct().forEach(System.out::println);
        System.out.println("===============================");
        names.stream().limit(3).forEach(e-> System.out.println(e));
        System.out.println("===============================");
        names.stream().skip(3).forEach(e-> System.out.println(e));
    }
}
