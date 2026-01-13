package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //heterogeneous elements
        List lst=new ArrayList<>();
        lst.add(10);
        lst.add("A");
        lst.add(null);
        lst.add(null);   //multiple null are allowed
        lst.add("A");    //duplicates are allowed
        System.out.println(lst);//[10, A, null, null, A]  insertion order preserved
    }
}
