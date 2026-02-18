package Java8.StreamAPI;

import java.util.stream.Stream;

public class ConvertingArrayToStream {
    public static void main(String[] args) {
        Integer []arr={1,2,3,4,5,6,7,8,9,10};
        Stream<Integer>stream=Stream.of(arr);
        //stream.forEach(e-> System.out.print(e+" "));
        stream.forEach(System.out::println);

    }
}
