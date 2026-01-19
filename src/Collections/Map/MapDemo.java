package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String > map=new HashMap<>();
        map.put(12,"A");
        map.put(21,"B");
        map.put(32,"C");
        map.put(41,"D");
        map.put(52,"E");
        map.put(52,"F");

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.remove(12));

        System.out.println(map.size());
        System.out.println(map.remove(12));//if value removed and again try to remove that value then it will return null
        System.out.println("Keys :"+map.keySet());
        System.out.println("Values : "+map.values());
        System.out.println("Key-Value : "+map.entrySet());

        map.put(55,"D");
        System.out.println(map);

    }
}
