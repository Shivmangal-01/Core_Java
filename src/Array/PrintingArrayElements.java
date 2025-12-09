package Array;

public class PrintingArrayElements {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60,70,80,90,100};
        //accessing array elements
        System.out.println("Array Length : "+arr.length);
        for (int i=0;i<arr.length; i++){
            System.out.println("Element present at index "+i+" is : "+arr[i]);


        }
    }
}
