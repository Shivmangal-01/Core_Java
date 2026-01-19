package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class IteratingUsingLoop {
    public static void main(String[] args) {
        Map<String,String>map=new HashMap<>();
        map.put("A","java");
        map.put("V","Java8");
        map.put("Z","Spring");
        map.put("M","SpringBoot");
        map.put("O","Hibernate");
        System.out.println(map);

        System.out.println("Iterating keys of map");
        for(String s:map.keySet()){
            System.out.println(s);
        }
        System.out.println("====================================");
        System.out.println("Iterating values of map");
        for(String s2:map.values()){
            System.out.println(s2);
        }


    }
}
