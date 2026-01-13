package ExceptionHandling;

public class TryReturn {
    int m1(){
        try{
            System.out.println("Try block");
            return 50;
        }
        catch (Exception e){
            System.out.println("Catch block");
        }
        return 20;
    }

    public static void main(String[] args) {
        TryReturn t=new TryReturn();
        System.out.println(t.m1());
    }
}
