package Java8.optionalclasses;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        Optional<List<String>>gender=Optional.of(Arrays.asList("Male","Female"));
        Optional<String>emptyGender=Optional.empty();
        if(gender.isPresent()){
            System.out.println("Value Available ");
        }else {
            System.out.println("Value not Available");
        }

        gender.ifPresent(s-> System.out.println("In gender optional value is available"));

        //condition failed no output print
        emptyGender.ifPresent(s-> System.out.println("In emptyGender ,value is available"));

    }
}
