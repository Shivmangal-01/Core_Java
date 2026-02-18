package Java8.MethodReferance;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String>list= Arrays.asList("Alice,bob,Charlie");
        //list.forEach((x)-> System.out.println(x));
        list.forEach(Demo::print);

    }
}
