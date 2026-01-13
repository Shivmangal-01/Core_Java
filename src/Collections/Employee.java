package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    //Constructor
    Employee(){}

    public Employee(int id,String firstName,String lastName, double salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                " firstName= " + firstName  +
                ", lastName= " + lastName +
                " salary=" + salary ;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getId()-o.getId();
        //return this.getFirstName().compareTo(o.getFirstName());
    }
}
class ComparableSorting{
    public static void main(String[] args) {
        Employee sarita=new Employee(5,"Sarita","Kadam",90000);
        Employee shivmangal=new Employee(3,"shiv","Biradar",10000);
        Employee shubhangi=new Employee(2,"Shubhangi","patange",90000);
        Employee nikita=new Employee(1,"nikita","dhangar",120000);
        List<Employee> empList=new ArrayList<>();
        empList.add(sarita);
        empList.add(shivmangal);
        empList.add(shubhangi);
        empList.add(nikita);
        System.out.println("Before Sorting : "+empList);

        Collections.sort(empList);
        System.out.println("After sorting : "+empList);
    }
}