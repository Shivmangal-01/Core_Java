package Array;

public class SwapPosition {
    public static void main(String[] args) {
        int []arr={101,102};
        System.out.println("Before Swapping");
        System.out.println("==============================");
        for(int i=0;i<arr.length;i++) {
            System.out.println("Element at index "+i+" is : "+arr[i]);
        }
        System.out.println("==============================");

        int temp=0;
        temp=arr[0];//101
        arr[0]=arr[1];//102
        arr[1]=temp; //101
        System.out.println("After Swapping");
        System.out.println("==============================");

        for(int i=0;i<arr.length;i++){
            System.out.println("Element at index "+i+" is : "+arr[i]);


        }
    }
}
