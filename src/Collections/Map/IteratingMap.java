package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(104,"A");
        map.put(105,"B");
        map.put(107,"C");
        map.put(110,"D");
        map.put(111,"E");

        System.out.println("Iterating map entries ");
        Iterator<Map.Entry<Integer,String>> itr=map.entrySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("============================================");
        System.out.println("Iterating keys of map");
        Iterator<Integer>itr2=map.keySet().iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }


        System.out.println("============================================");
        System.out.println("Iterating values of map");
        Iterator<String>itr3=map.values().iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }

    }
}
