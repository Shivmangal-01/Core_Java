package ExceptionHandling;

public class TryWithMultipleCatch1 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
//        catch (Exception e) {
//            //we got Exception ----->Exception 'java.lang.ArithmeticException' has already been caught
//            System.out.println("Exception");
//        }
        catch (ArithmeticException ar){
            System.out.println("Arithmetic Exception");
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
