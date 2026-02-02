package Collections.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapMethod {
    public static void main(String[] args) {
        LinkedHashMap<Character,String>lm=new LinkedHashMap<>();
        lm.put('A',"java");
        lm.put('B',"hibernate");
        lm.put('C',"Java8");
        lm.put('D',"Spring");
        lm.put('E',"SpringBoot");

        System.out.println(lm);
    }
}
