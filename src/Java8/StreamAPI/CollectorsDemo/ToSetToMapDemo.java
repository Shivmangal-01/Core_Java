package Java8.StreamAPI.CollectorsDemo;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSetToMapDemo {
    public static void main(String[] args) {
        //toSet()-collect elements into set (allow only unique elements,does not maintain insertion order)
        List<Integer>list=List.of(10,20,10,15,20,30,30);
        Set<Integer> set=list.stream().collect(Collectors.toSet());
        System.out.println("list : "+list);
        System.out.println("Set : "+set);

        //toMap()- collect elements into map
        //unique keys
        List<String>cities=List.of("Mumbai","Pune","Jaipur","Delhi","Latur","Udgir");
        Map<String,Integer>map=cities.stream().collect(Collectors.toMap(s->s,
                String::length));

        System.out.println(map);

        //Duplicate keys  - in many cases duplicate keys are there then it throws IllegalStateException to handle it
        //we have one more overloaded method which takes mapper as a input which decide which action to take if duplicate keys are found

        //convert list to map , element length should be the key and element should be the value
        Map<Integer,String>resultMap=cities.stream().collect(Collectors.toMap(s->s.length(),s->s,(oldVal,newVal)->newVal));
        System.out.println(resultMap);





    }
}
