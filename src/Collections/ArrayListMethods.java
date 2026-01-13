package Collections;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        //adding elements
        list.add("A");
        list.add("B");
        list.add("Z");
        list.add("M");
        System.out.println(list);  //[A, B, Z, M]


        ArrayList<String> list2=new ArrayList<>();
        list2.add("X");
        list2.add("Y");
        list2.add("Z");





        //removing element
        list.remove("Z");
        System.out.println(list);//[A, B, M]
        list.set(2,"N");
        System.out.println(list);  //[A, B, N]
        System.out.println(list.get(1));  //accessing values based on index  (returns B)

//        list.clear();//removes all elements from arraylist
//        System.out.println(list);   //        []

        list.add(1,"K");
        System.out.println(list);//[A, K, B, N]


        list.addAll(list2);
        System.out.println(list);//[A, K, B, N, X, Y, Z]

        System.out.println(list.size()); //no. of elements in arraylist
        System.out.println(list.contains("B")); //checks that element present in arraylist or not
        System.out.println(list.indexOf("N"));//return index of the N






    }
}
