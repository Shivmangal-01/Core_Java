package Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetApplyingSortedSetMethods {
    public static void main(String[] args) {

        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(50);
        set.add(100);
        set.add(20);
        set.add(70);
        set.add(100);//adding duplicate
        TreeSet<Integer> tset=new TreeSet<>(set);
        System.out.println(tset);//[10, 20, 50, 70, 100]

        //methods of sorted set interface
        System.out.println("First Element  : "+tset.first());
        System.out.println("Last Element : "+tset.last());
        System.out.println("HeadsetElement : "+tset.headSet(30));
        System.out.println("TailsetElement : "+tset.tailSet(50));
        System.out.println("========================================================");


        //NAvigable interface methods
        System.out.println("Largest element less than 100 : "+tset.lower(100));
        System.out.println("Smallest element greater than 10 : "+tset.higher(10));
        System.out.println("Floor : "+tset.floor(75));
        System.out.println("Ceil : "+tset.ceiling(20));

        System.out.println(tset);
        System.out.println(tset.pollFirst());//removes and retrieve first element from set
        System.out.println(tset.pollLast());//removes and retrieve last element from set
        System.out.println(tset);
    }
}
