package Collections;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

class EmployeeDetails{
    private int id;
    private String firstName;
    private double salary;

    public EmployeeDetails(int id, String name, double salary) {
        this.id = id;
        this.firstName = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id : "+id +"    name : "+firstName+"    salary : "+salary;
    }
}
class ComparatorSortingDemo implements Comparator <EmployeeDetails> {
    @Override
    public int compare(EmployeeDetails o1, EmployeeDetails o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}

public class ComparatorSorting {
    public static void main(String[] args) {
        ArrayList<EmployeeDetails> list = new ArrayList<>();

        list.add(new EmployeeDetails(101, "Rahul", 50000));
        list.add(new EmployeeDetails(103, "Amit",  60000));
        list.add(new EmployeeDetails(102, "Neha", 55000));

        // Sorting using Comparator
        Collections.sort(list, new ComparatorSortingDemo());
        for (EmployeeDetails e:list){
            System.out.println(e);
        }
    }
}
