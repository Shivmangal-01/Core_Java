package Java8.Lambda;

import java.util.ArrayList;
import java.util.Collections;

public class ImplementingComparator {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("G");
        list.add("Z");
        list.add("A");
        System.out.println(list);

        Collections.sort(list,(a,b)->a.compareTo(b));
        System.out.println(list);
        Collections.sort(list,(a,b)->b.compareTo(a));
        System.out.println(list);

    }
}
