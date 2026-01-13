package Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratingLinkedListUsingListIterator {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(5);
        list.add(7);
        list.add(2);
        System.out.println(list);
        Collections.sort(list);
        ListIterator itr=list.listIterator();
        System.out.println("Iterating forward direction");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Iterating backward direction ");
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
