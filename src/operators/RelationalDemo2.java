package operators;

public class RelationalDemo2 {
    void examEligibility(int age){
        if (age >=23 && age<=35){
            System.out.println("Qualified for exam");
        }
        else {
            System.out.println("Not qualified for exam");
        }
    }

    public static void main(String[] args) {
        RelationalDemo2 obj=new RelationalDemo2();
        obj.examEligibility(18);
        obj.examEligibility(25);
        obj.examEligibility(38);
    }
}
