package Collections.Set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<>();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.add("A");
        set.add("Z");
        set.add("M");
        set.add("Q");
        //set.add(null);//NullPoinnterException
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        set.remove("M");
        System.out.println(set);

        if(set.contains("A")){
            System.out.println("Set contains A");
        }else {
            System.out.println("Set doesnt contain A");
        }

        set.clear(); //removes all elements from set
        System.out.println(set);
    }
}
