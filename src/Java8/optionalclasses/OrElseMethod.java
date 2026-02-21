package Java8.optionalclasses;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OrElseMethod {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("java","java8","hibernate","spering","jdbc");
        List<String>emptyList=Arrays.asList();

        Optional<String>firstFound=list
                .stream()
                .filter(name->name.startsWith("j"))
                .findFirst();

        //orElse() to get value or default value
        String nameToUse=firstFound.orElse("Default value");
        System.out.println("The found name is : "+nameToUse);

        //empty example
        String nameFromEmpty=emptyList.stream().filter(name->name.startsWith("Z")).findFirst().orElse("No name found");
        System.out.println("Result from empty Search : "+nameFromEmpty);

    }
}
