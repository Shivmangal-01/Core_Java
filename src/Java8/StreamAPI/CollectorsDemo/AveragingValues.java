package Java8.StreamAPI.CollectorsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AveragingValues {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        double res=list.stream().collect(Collectors.averagingInt(a->a));
        System.out.println(res);

        //without averging() calculate average
        int sum=list.stream().reduce(0,(a,b)->a+b);
        double result=(double) sum/list.size();
        System.out.println("Average : "+result);



    }
}
