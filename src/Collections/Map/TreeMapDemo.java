package Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();
        map.put("R","Red");
        map.put("G","Green");
        map.put("Y","Yellow");
        map.put("B","Black");
        map.put("O","Orange");
        System.out.println("HashMap : "+map);
        System.out.println("============================================");

        //creating treemap from previous hashmap
        TreeMap<String,String>tmap=new TreeMap<>(map);
        System.out.println("Keys in treemap are in ascending order");
        System.out.println("TreeMap : "+tmap);
        System.out.println("============================================");

        //Create linkedHashMap
        LinkedHashMap<String,String >lmap=new LinkedHashMap<>();
        lmap.put("R","Red");
        lmap.put("G","Green");
        lmap.put("Y","Yellow");
        lmap.put("B","Black");
        lmap.put("O","Orange");
        System.out.println("LinkedHashMap : "+lmap);
        System.out.println("============================================");
    }
}
