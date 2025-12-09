package Array;

public class ArrayPrintUsingWhile {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int i=0;
        while(i<arr.length){
            System.out.println("Element at index "+i+" is "+arr[i]);
            i++;
        }
    }
}
