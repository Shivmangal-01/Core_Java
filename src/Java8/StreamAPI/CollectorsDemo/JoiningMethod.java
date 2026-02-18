package Java8.StreamAPI.CollectorsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningMethod {
    public static void main(String[] args) {
        List<String> cities= Arrays.asList("Mumbai","Pune","Latur","Banglore","Hydrabad");
        String res=cities.stream().collect(Collectors.joining(" "));
        System.out.println(res);

        //adding prefix and suffix
        String s=cities.stream().collect(Collectors.joining(" ","{ "," }"));
        System.out.println(s);
    }
}
