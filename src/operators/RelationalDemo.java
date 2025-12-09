package operators;

public class RelationalDemo {
    void voteEligibility(int age){
        if(age>=18){
            System.out.println("Eligible for vote");
        }
        else {
            System.out.println("Not Eligible for vote");
        }
    }

    public static void main(String[] args) {
        RelationalDemo obj=new RelationalDemo();
        obj.voteEligibility(20);



    }
}
