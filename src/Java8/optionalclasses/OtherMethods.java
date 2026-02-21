package Java8.optionalclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OtherMethods {
    public static void main(String[] args) {
        List<String>list=List.of("java","java8","hibernate","spring");

        Optional<List<String>>opt=Optional.of(list);
        opt.ifPresent(x-> System.out.println(x));

        //Empty optional
        Optional<String>emptyOptional=Optional.empty();

        emptyOptional.ifPresentOrElse(
                x -> System.out.println(x),
                () -> System.out.println("Empty")
        );


    }
}
