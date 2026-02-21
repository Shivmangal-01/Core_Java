package Java8.optionalclasses;

import java.util.Optional;

public class FilterMethod {
    public static void main(String[] args) {
        Optional<Integer>opt=Optional.of(100);
        Optional <Integer>evenNum=opt.filter(a->a%2==0);
        System.out.println(evenNum);

        Optional<Integer>oddNum=opt.filter(a->a%2!=0);
        System.out.println(oddNum);
    }
}
