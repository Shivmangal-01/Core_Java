package Array;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
//        int []arr={1,2,3,4,5};
//        int[]dummy=new int[arr.length];
//        for (int i=0;i<arr.length;i++){
//            dummy[i]=arr[i];
//        }
//        System.out.println("Copied array");
//        for (int i=0;i<dummy.length;i++){
//            System.out.print(dummy[i]+" ");
//        }


        int []arr={10,200,30,40,50};
        int []arr1=new int[arr.length];
        System.out.println("Before Copying");
        System.out.println(Arrays.toString(arr1));
        for (int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr1));


    }
}
