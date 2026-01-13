package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingArrayListUsingIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(10);
        for(int i=0;i<list.size();i++){
            if(list.get(i)==5){
                list.set(i,50);
            }
        }
        System.out.println(list);  //[1, 50, 2, 10]


        System.out.println("ITerating using iterator");
        Iterator <Integer> itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Using ListIterator --forward iteration");
        ListIterator<Integer> litr= list.listIterator();
        while (litr.hasNext()){
            System.out.print(litr.next()+" ");
        }
        System.out.println();
        System.out.println("Using ListIterator --Backward iteration");
        while (litr.hasPrevious()){
            System.out.print(litr.previous()+" ");
        }
    }
}
