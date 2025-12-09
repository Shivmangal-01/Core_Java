package ScannerExamples;
import java.util.Scanner;
public class EmpDetails {
    String empName;
    int empId;
    long empSal;
    String empDept;
    String empAddress;

    //Scanner object
    Scanner sc=new Scanner(System.in);

    void getDetails(){
        System.out.println("Enter Employee Details ");
        System.out.println("=====================================");
        System.out.println("Employee Name : ");
        empName=sc.nextLine();

        System.out.println("Employee ID : ");
        empId=sc.nextInt();

        System.out.println("Employee Salary : ");
        empSal=sc.nextLong();

        System.out.println("Employee Department : ");
        sc.nextLine();
        empDept=sc.nextLine();

        System.out.println("Employee Address : ");

        empAddress=sc.nextLine();
    }

    //another method for displaying data
    void display(){
        System.out.println("Employee Name : "+empName);
        System.out.println("Employee ID : "+empId);
        System.out.println("Employee Salary :"+empSal);
        System.out.println("Employee Department : "+empDept);
        System.out.println("Employee Address : "+empAddress);
    }

    public static void main(String[] args) {
        EmpDetails obj=new EmpDetails();
        obj.getDetails();
        System.out.println("----------------You have entered below details------------");
        obj.display();
    }


}
