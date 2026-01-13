package Collections.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lset=new LinkedHashSet<>();
        //adding elements to linkedhashset
        lset.add(100);
        lset.add(500);
        lset.add(200);
        lset.add(400);
        lset.add(300);
        lset.add(null);  //one null value allowed
        lset.add(500);  //it wont take duplicate element
        System.out.println(lset);  //[100, 500, 200, 400, 300, null]
        System.out.println(lset.size());//no. of elements present in linkedhashset  6

        //creating another linkedhashset
        LinkedHashSet<Integer> lset2=new LinkedHashSet<>();
        lset2.add(1000);
        lset2.add(700);

        //adding all elements of another collection to lset
        lset.addAll(lset2);
        System.out.println(lset);

        if(lset.contains(1000)){
            System.out.println("Present in linkedHashSet");
        }
        else {
            System.out.println("Not present in linkedlist");
        }

        System.out.println(lset2);
        lset2.remove(1000);
        System.out.println(lset2);
        lset2.add(800);
        lset2.add(120);
        System.out.println(lset2);
        System.out.println(lset);
        lset.removeAll(lset2);
        System.out.println(lset);



    }
}
