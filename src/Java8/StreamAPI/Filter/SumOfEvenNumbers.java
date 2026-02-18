package Java8.StreamAPI.Filter;

import java.util.Arrays;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int sum= Arrays.stream(arr).filter(i->i%2==0).sum();
        System.out.println(sum);
    }
}
