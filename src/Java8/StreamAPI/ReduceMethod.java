package Java8.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class ReduceMethod {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5);
        int res=0;
        for(Integer i:list){
            res+=i;
        }
        System.out.println("Sum Using collection : "+res);
        System.out.println("==========================");
        //using reduce()
        int sum=list.stream().reduce(0,(a,b)->a+b);
        System.out.println("Sum : "+sum);

    }
}
