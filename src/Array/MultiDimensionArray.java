package Array;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        //Accessing multidimenstional array elements
        System.out.println(arr[1][0]);//4
        System.out.println(arr[2][2]);//9
        System.out.println("================================");

        //accessing array using loop
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
