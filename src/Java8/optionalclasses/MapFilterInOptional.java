package Java8.optionalclasses;

import java.util.Optional;

public class MapFilterInOptional {
    public static void main(String[] args) {

        Optional<String>opt=Optional.of("Java");
        Optional<Integer>nameLength=opt.map(String::length);
        System.out.println(nameLength.orElse(0));



        //empty optional
        Optional<String>emptyOptional=Optional.empty();
        Optional<Integer>namelen=emptyOptional.map(String::length);
        System.out.println(namelen.orElse(100));


    }
}
