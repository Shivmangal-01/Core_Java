package Array;

public class SortArray {
    public static void main(String[] args) {
        int []arr={5,2,8,1,3};
        //sort array in ascending order
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        System.out.println("Sorted Array In ascending order:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
