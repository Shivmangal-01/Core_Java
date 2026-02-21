package Java8.optionalclasses;

import java.util.List;

public class OrElseThrow {
    public static void main(String[] args) {
        List<String>list=List.of("java","hibernate","Spring");
        //no- arg orElseThrow() --it throws NoSuchElementException
        //list.stream().filter(name->name.startsWith("G")).findFirst().orElseThrow();

        //list.stream().filter(name->name.startsWith("G")).findFirst().orElseThrow(new RuntimeException("Exception occured"));
    }
}
