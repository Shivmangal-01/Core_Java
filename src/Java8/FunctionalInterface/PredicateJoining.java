package Java8.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateJoining {
    public static void main(String[] args) {
        int []x={0,5,10,15,20,25,30,35};
        Predicate<Integer>p1=z->z % 2==0;
        Predicate<Integer>p2=y->y>10;

        System.out.println("Numbers which are even and greater than 10  are : ");
        for(int i:x){
            if(p1.and(p2).test(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        System.out.println("============================================");
        System.out.println("numbers which are even or gretter than 10 are: ");
        for(int i:x){
            if(p1.or(p2).test(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("============================================");

        System.out.println("numbers which are not even : ");
        for(int i:x){
            if(p1.negate().test(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("============================================");

        System.out.println("numbers which are not greater than 10 : ");
        for(int i:x){
            if(p2.negate().test(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();




    }
}
