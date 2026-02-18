package Java8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SecondMaxAndMin {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,90,58,38,20,20);
        int secondMin=list.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println("Second min : "+secondMin);
        System.out.println("================");
        int secondMax=list.stream().sorted((a,b)->b-a).distinct().skip(1).findFirst().get();
        System.out.println(secondMax);

        list.stream().sorted().distinct().skip(1).limit(1);


    }
}
