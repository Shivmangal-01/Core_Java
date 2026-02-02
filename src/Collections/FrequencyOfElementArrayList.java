package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfElementArrayList {
    public static void main(String[] args) {
        ArrayList<String> ar=new ArrayList<>();
        ar.add("A");
        ar.add("V");
        ar.add("S");
        ar.add("P");
        ar.add("A");
        ar.add("A");
        ar.add("S");
        System.out.println(ar);
        System.out.print("Frequency of A : ");
        System.out.println( Collections.frequency(ar,"A"));
        System.out.println("Frequency of s : "+Collections.frequency(ar,"S"));

    }
}
