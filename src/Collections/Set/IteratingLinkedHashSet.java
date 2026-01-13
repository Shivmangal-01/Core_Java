package Collections.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteratingLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lset=new LinkedHashSet<>();
        lset.add("Java");
        lset.add("Python");
        lset.add("HTML");
        lset.add("CSS");
        lset.add("JavaScript");
        System.out.println(lset);
        System.out.println("--------------------------");

        //Iterating through Enhanced for loop
        for(String s:lset){
            System.out.println(s);
        }
        System.out.println("--------------------------");

        //Iterating through Iterator
        Iterator<String>itr=lset.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

    }
}
