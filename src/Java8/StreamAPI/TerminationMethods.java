package Java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class TerminationMethods {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("AWS");
        list.add("Azure");
        //allMatch()-it checks all records should match
        boolean res=list.stream().allMatch(str->str.contains("Java"));
        System.out.println(res);
        //anyMatch()-either one record should match or more than one
        boolean res2=list.stream().anyMatch(str->str.contains("Java"));
        System.out.println(res2);
    }
}
