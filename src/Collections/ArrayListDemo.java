package Collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arlist=new ArrayList<>();
        arlist.add("A");
        arlist.add("A");
        arlist.add("B");
        arlist.add("C");
        arlist.add("D");
        arlist.add(null);
        arlist.add(null);
        System.out.println(arlist);   //[A, A, B, C, D, null, null]

    }
}
