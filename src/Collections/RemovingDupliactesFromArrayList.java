package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemovingDupliactesFromArrayList {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("A");
        list.add("Z");
        list.add("M");
        list.add("P");
        list.add("G");
        list.add("Z");
        list.add("G");
        list.add(null);
        System.out.println(list);
        //Hashset
        LinkedHashSet <String> lset=new LinkedHashSet<>(list);
        System.out.println(lset);
    }
}
