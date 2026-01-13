package Collections;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(null);
        list.add(1);
        list.add(12);
        list.add(15);
        System.out.println(list); //[1, null, 1, 12, 15]

        //using for loop
        System.out.println("Using for loop");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        System.out.println("Using for each");
        for(Integer i:list){
            System.out.print(i+" ");
        }

        System.out.println("Using while");
        int i=0;
        while (list.size()>i){
            System.out.print(list.get(i)+" ");
            i++;
        }
    }
}
