package Collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(null);   //allows null
        list.add(50);    //allows duplicates
        System.out.println(list);
        list.remove(1);
        list.set(1,200);
        System.out.println(list);  //[10, 200, null, 50]

        System.out.println(list.indexOf(200));
        System.out.println(list.indexOf(500));  //returns -1 becoz 500 is not present in linkedlist

        System.out.println(list.size());
        System.out.println(list.contains(200));


    }
}
