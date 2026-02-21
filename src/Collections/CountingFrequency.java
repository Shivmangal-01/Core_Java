package Collections;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class CountingFrequency {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(10);
        list.add(20);
        list.add(10);

        //without optional
        int frequency=0;
        for(Integer i:list){
            if(i.equals(10)){
                frequency++;
            }
        }
        System.out.println("Frequency of 10 : "+frequency);

        int fre=Collections.frequency(list,10);
        System.out.println("Using Collections Frequency method : "+fre);


        //with optional
        int count=0;
        for(Integer i:list){
            Optional<Integer>opt=Optional.of(i);
            if(opt.isPresent() && opt.get()==10){
                count++;
            }
        }
        System.out.println("Frequency (Using optional) : "+count);

        System.out.println("Using java 8 : ");
        long counts=list.stream().filter(a->a.equals(10)).count();
        System.out.println("Java 8 : "+counts);
    }
}
