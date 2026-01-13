package Collections.Set;

import java.util.ArrayList;

public class AddingArrayElementsToArrayList {
    public static void main(String[] args) {
        int []arr={10,2,5,79,30};
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }

        System.out.println(list);
    }
}
