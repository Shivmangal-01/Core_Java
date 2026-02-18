package Java8.StreamAPI.CollectorsDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMap {
    public static void main(String[] args) {
        List<String> cities= Arrays.asList("Mumbai","Delhi","Banglore","Chennai","Pune","Jaipur","Java");
        System.out.println(cities);
        //converting list to map using collection
        Map<Integer,String> map=new HashMap<>();
        for(String s:cities){
            map.put(s.length(),s);
        }
        System.out.println(map);
        System.out.println(map.size());

        //Converting list to map using toMap()
        Map<Integer,String>resultMap=cities.stream().collect(Collectors.toMap(s->s.length(),s->s,(oldVal,newVal)->newVal));
        System.out.println(resultMap);
    }
}
