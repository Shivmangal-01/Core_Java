package Encapsulation;

public class Task1Test {
    void display(){
        Task1 obj=new Task1();
        obj.setEmpName("Shiv");
        obj.setEmpId(101);
        obj.setEmpSal(90000);
        obj.setEmpDept("Development");
        obj.setEmpAdd("pune");
        System.out.println("Employee Name : "+obj.getEmpName());
        System.out.println("Employee Id : "+obj.getEmpId());
        System.out.println("Employee Salary : "+obj.getEmpSal());
        System.out.println("Employee Department : "+obj.getEmpDept());
        System.out.println("Employee Address : "+obj.getEmpAdd());
    }

    public static void main(String[] args) {
        Task1Test obj=new Task1Test();
        obj.display();
    }
}
