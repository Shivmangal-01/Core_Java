package Collections.Map;
import java.util.LinkedHashMap;
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(1012,"AA");
        lhm.put(108,"BB");
        lhm.put(110,"CC");
        lhm.put(111,"DD");
        System.out.println("Size : "+lhm.size());
        System.out.println(lhm);

        System.out.println(lhm.get(1012));
        System.out.println(lhm.remove(1012));
        System.out.println(lhm);

        //adding null as key and value
        lhm.put(null,null);
        System.out.println(lhm);

        //again trying to add
        lhm.put(null,"CDD");
        System.out.println(lhm);

        //replace()
        lhm.replace(108,"BBBB");
        System.out.println(lhm);

    }
}
