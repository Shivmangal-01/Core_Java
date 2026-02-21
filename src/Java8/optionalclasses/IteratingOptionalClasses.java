package Java8.optionalclasses;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class IteratingOptionalClasses {
    public static void main(String[] args) {
        Optional<List<Integer>>opt=Optional.of(Arrays.asList(1,2,3,4,5));
        //Empty optional
        Optional<Integer>emptyOptional=Optional.empty();

        //First way
        if(opt.isPresent()){
            System.out.println(opt.get());
        }

        //Second way
        opt.ifPresent(s-> System.out.println(s));

        //Third way
        opt.ifPresentOrElse(s-> System.out.println(s),
                ()-> System.out.println("Not present"));

        //Fourth way
        opt.stream().forEach(s-> System.out.println(s));

        //Fifth Way
        //orElse()- it returns the value if that is present else it returns default value
        System.out.println(opt.orElse(Arrays.asList(100)));//returns the list
        System.out.println(emptyOptional.orElse(100));//returns default value
        System.out.println("=============================================");

        //Iterator Sixth way4
        Iterator<Integer>itr=opt.get().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("=============================================");

        //if optional is empty then get() throws an exception NoSuchElementException
        if(opt.isPresent()){
            Iterator<Integer>itr2=opt.get().iterator();
            while (itr2.hasNext()){
                System.out.print(itr2.next()+" ");
            }
        }


    }
}
