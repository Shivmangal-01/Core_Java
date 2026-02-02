package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(100);
        ar.add(101);
        ar.add(102);
        ar.add(103);
        ar.add(104);
        ar.add(105);
        System.out.println("Arraylist before reversing : "+ar);
        System.out.println();
        Collections.reverse(ar);
        System.out.println("Arraylist after reversing "+ar);
    }
}
