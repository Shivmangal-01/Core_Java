package ExceptionHandling;

public class TryWithMultipleCatch {
    void m1(){
        System.out.println("m1() called");
    }
    public static void main(String[] args) {
        try{
            //System.out.println(10/0);
            int []arr={10,20,30};
            //System.out.println(arr[5]);
            //TryWithMultipleCatch obj=null;
            //obj.m1();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
