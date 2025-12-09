package Array;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        //length of an array
        System.out.println("Length of an array :"+arr.length);
        //printing array without loop
        System.out.println(Arrays.toString(arr));
        //accessing array elements
        System.out.println(arr[1]);
        //System.out.println(arr[5]); //Exception---Array Index Out Of Bound
        System.out.println(arr[4]);
        //Modifying array element
        arr[1]=200;
        System.out.println(Arrays.toString(arr));


    }
}
