package Collections.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class IteratingTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(10);
        set.add(100);
        set.add(50);
        set.add(70);
        System.out.println(set);

        //ITerating treeset
        System.out.println("Iterating in ascending order");
        Iterator<Integer> itr=set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("===============================");
        System.out.println("Iterating in descending order ");
        Iterator it= set.descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
