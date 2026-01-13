package Collections;

import java.util.Collections;
import java.util.LinkedList;

public class SortingLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Z");
        list.add("C");
        list.add("M");
        list.add("G");
        System.out.println("Before sorting ");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sorting");
        System.out.println(list);

    }
}
