package Encapsulation;
import constructor.ClassA;

import java.util.Scanner;
public class EncapsulationTest {
    void display(){
        Scanner sc=new Scanner(System.in);
        EncapsulationDemo obj=new EncapsulationDemo();

        System.out.println("Enter studentRollNumber");
        obj.setStudentRollNumber(sc.nextInt());

        System.out.println("Enter studentName ");
        obj.setStudentName(sc.next());

        System.out.println("Student name : "+obj.getStudentName());
        System.out.println("Student Roll number : "+obj.getStudentRollNumber());

    }

    public static void main(String[] args) {
        EncapsulationTest obj=new EncapsulationTest();
        obj.display();
    }
}
