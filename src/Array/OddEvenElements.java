package Array;

public class OddEvenElements {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        for (int i=0;i<=arr.length-1 ; i++){
            if(arr[i]%2==0){
                System.out.println("Element "+arr[i]+" is Even number");
            }else{
                System.out.println("element "+arr[i]+" is odd number");
            }
        }
    }
}
