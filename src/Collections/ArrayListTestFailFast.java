package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTestFailFast {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("Z");
        list.add("M");
        list.add("A");
        list.add("K");
        list.add("O");
//
//        for(String s:list){
//            System.out.println(s);
//            list.add("R");
//        }

        Iterator <String>itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();

        }
    }
}
