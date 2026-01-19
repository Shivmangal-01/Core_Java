package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceMethods {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        //adding entries to map
        map.put(101,"A");
        map.put(102,"B");
        map.put(103,"C");
        map.put(104,"D");
        map.put(105,"E");
        System.out.println(map); //{101=A, 102=B, 103=C, 104=D, 105=E}

        //if adding same key again then it replace old entry with new
        //map.put(105,"F");

        //printing map
        System.out.println(map);  //{101=A, 102=B, 103=C, 104=D, 105=F}

        //get()
        System.out.println(map.get(102)); //B
        System.out.println(map.get("B"));//null because it did not have B key

        //hashcode()
        System.out.println("Map hashcode : "+map.hashCode());


        //another map
        Map<Integer,String> map2=new HashMap<>();
        map2.put(201,"P");
        map2.put(202,"Q");
        map2.put(203,"R");
        System.out.println(map2);
        System.out.println("Map2 hashcode : "+map2.hashCode());

        //3re map object
        Map<Integer,String> map3=new HashMap<>();
        map3.put(101,"A");
        map3.put(102,"B");
        map3.put(103,"C");
        map3.put(104,"D");
        map3.put(105,"E");
        System.out.println(map3);
        System.out.println("Map3 hashcode : "+map3.hashCode());//map and map3 hashcode is same because entries are same in both map

        //containsKey()
        System.out.println(map.containsKey(104));

        //containsValue()
        System.out.println(map.containsValue("C"));

        //putAll()
        System.out.println(map);
        map.putAll(map2);
        System.out.println(map);

        //boolean remove(key,value)
        System.out.println(map.remove(105,"E"));
        System.out.println(map.remove(102,"Z"));

        //clear()
        map3.clear();
        System.out.println(map3);

        //isEmpty()
        System.out.println("map : "+map.isEmpty());
        System.out.println("map3 : "+map3.isEmpty());

        //replace()
        System.out.println(map);
        System.out.println(map.replace(102,"BB"));

        System.out.println(map.replace(103,"C","CCC"));
        System.out.println(map);

        System.out.println(map.equals(map2));









    }
}
