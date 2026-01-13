package Collections.Set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        //adding elements to set
        set.add(10);
        set.add(4);
        set.add(null);
        set.add(5);
        set.add(4);  //it takes only one 4
        System.out.println(set);   //unordered  elements   [null, 4, 5, 10]

        //removing elements
        set.remove(4);   //removes 4
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(null));
        System.out.println("Is set empty : "+set.isEmpty());
//        set.clear();  //removes all elements from set
//        System.out.println(set);

        if(set.contains(null)){
            System.out.println("Set contains null value");
        }else {
            System.out.println("Set doesn't have null value");
        }
        System.out.println( set.remove(100));
    }

}
