package Java8.StreamAPI.Map;

import java.util.ArrayList;
import java.util.List;

public class MapDemo {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Shivmangal");
        list.add("Vishranti");
        list.add("Vishu");
        list.add("Shiva");
        list.add("Komal");
        //finding each string length
        list.stream().map(String::length).forEach(e-> System.out.println(e));

        //converting each string to uppercase
        list.stream().map(String::toUpperCase).forEach(e-> System.out.print(e+" "));
        System.out.println();

        list.stream().map(s->s.toUpperCase()).forEach(e-> System.out.print(e+" , "));
        System.out.println();

        //find length of string starts with "V"
        list.stream().filter(s->s.startsWith("V")).map(e->e+" - "+e.length()).forEach(e-> System.out.println(e));

    }
}
