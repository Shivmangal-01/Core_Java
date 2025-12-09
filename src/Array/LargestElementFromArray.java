package Array;

public class LargestElementFromArray {
    public static void main(String[] args) {
        int []arr={10,40,5,55,30};
        int largest=arr[0];
        for (int i=1;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
