package Java8.optionalclasses;

import java.util.Optional;

public class CreatingOptional {
    public static void main(String[] args) {
        Optional<String>opt=Optional.ofNullable("Hey");
        opt.ifPresent(s-> System.out.println(s));
        Optional<String>opt2=Optional.ofNullable(null);
        opt2.ifPresent(s-> System.out.println(s));
    }
}
