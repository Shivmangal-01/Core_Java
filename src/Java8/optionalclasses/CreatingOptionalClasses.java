package Java8.optionalclasses;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class CreatingOptionalClasses {
    public static void main(String[] args) {
        //creating empty optional
        Optional<String>opt=Optional.empty();
        System.out.println(opt);

        Optional<String>opt2=Optional.ofNullable(null);
        if(opt2.isPresent()){
            opt2.get();
        }

        //optional contains only one value it is used to represent one value that may or may not present.
        Optional<String>opt3=Optional.of("Java");//valid
        //Optional<String>opt3=Optional.of("Java","Python");//Invalid

        //if i want to store multiple values then create list and pass the list to the optional.of
        List<String>list= Arrays.asList("java","Python","java8","hibernate");
        Optional<List<String>>opt4=Optional.of(list);







    }

}
