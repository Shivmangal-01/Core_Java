package Array;

public class FindSmallElement {
    public static void main(String[] args) {
        int []arr={10,40,55,5,30};
        int small=arr[0];
        for (int i=1;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        System.out.println("small Element : "+small);
    }
}
