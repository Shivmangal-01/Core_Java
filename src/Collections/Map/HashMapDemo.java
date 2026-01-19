package Collections.Map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("Shiv",1234567890);
        hm.put("Komal",1087654321);
        System.out.println(hm);
        System.out.println("Shiv's phone number : "+hm.get("Shiv"));
        //iterating HashMap
        Iterator<Entry<String,Integer>> itr=hm.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
