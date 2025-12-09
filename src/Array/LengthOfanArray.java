package Array;

public class LengthOfanArray {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        int length=0;
        for(int i=0;i<arr.length;i++){
            length+=1;
        }
        System.out.println("Length of an array : "+length);
    }
}
