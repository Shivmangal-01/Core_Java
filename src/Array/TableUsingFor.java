package Array;

public class TableUsingFor {
    void meth1(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }

    }

    public static void main(String[] args) {
        TableUsingFor obj=new TableUsingFor();
        obj.meth1(2);
    }
}
