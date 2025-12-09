package Array;

public class Task1 {
    int[] meth1(){
        int arr[]={3,2,2};
        for (int i=0;i<arr.length-1;i++){
            if( (arr[i]==2 )&&(arr[i+1]==3)) {
                arr[i + 1] = 0;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Task1 obj=new Task1();
        int res[]=obj.meth1();
        for (int x:res){
            System.out.print(x+" ");
        }
    }
}
