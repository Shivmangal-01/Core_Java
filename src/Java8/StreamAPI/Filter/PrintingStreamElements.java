package Java8.StreamAPI.Filter;

import java.util.ArrayList;
import java.util.List;

public class PrintingStreamElements {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("V");
        list.add("S");
        list.add("R");
        list.add("P");
        list.add("S");
        list.add("P");
        list.add("A");
        list.stream().limit(5).forEach(i-> System.out.print(i+" "));
        System.out.println();
        System.out.println("=============================================");
        list.stream().distinct().forEach(e-> System.out.print(e+" "));
        System.out.println();
        System.out.println("=============================================");
        list.stream().skip(2).forEach(i-> System.out.print(i+" "));
    }
}
