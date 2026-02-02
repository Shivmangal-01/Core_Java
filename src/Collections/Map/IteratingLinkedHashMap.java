package Collections.Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class IteratingLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>lm=new LinkedHashMap<>();
        lm.put(1,"A");
        lm.put(2,"B");
        lm.put(3,"C");
        lm.put(4,"D");
        lm.put(5,"E");
        System.out.println(lm);
        System.out.println("==========================================");

        Iterator<Entry<Integer,String>> itr=lm.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("==========================================");


        //Iterating only keys
        Iterator<Integer> itr2=lm.keySet().iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("==========================================");

        //Iterating only values
        Iterator <String> itr3=lm.values().iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }

        System.out.println("==========================================");
        System.out.println("Using for each loop---keys");
        for(Integer i:lm.keySet()){
            System.out.println(i);
        }

        System.out.println("==========================================");
        System.out.println("Using for each loop---Values");
        for(String str:lm.values()){
            System.out.println(str);
        }
    }
}
