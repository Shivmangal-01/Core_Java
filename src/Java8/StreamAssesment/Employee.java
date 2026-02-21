package Java8.StreamAssesment;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    int id;
    String name;
    int age;
    String gender;
    String Department;
    int yearOfJoining;
    double salary;

    //constructor to initialize these instance variables
    public Employee(int id, String name,int age,String gender,String Department,int yearOfJoining,double salary){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.Department=Department;
        this.yearOfJoining=yearOfJoining;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return Department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", Department='" + Department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        //System.out.println(employeeList);

        //1. How many male and female employees are there in the organization?
        Map<String ,Long> noOfFemaleAndMaleEmployees=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(noOfFemaleAndMaleEmployees);

        //without counting()
        Map<String,List<Employee>> noOfEmployees=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender));
        System.out.println(noOfEmployees);

        //Print the name of all departments in the organization?
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        //count of all departments
        long departments=employeeList.stream().map(Employee::getDepartment).distinct().count();
        System.out.println("No of departments are : "+departments);

        //What is the average age of male and female employees?
        Map<String,Double> averageAgeOfMaleFemaleEmp=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println(averageAgeOfMaleFemaleEmp);

        //Get the details of highest paid employee in the organization?
        Optional<Employee> highestPaidEmp=employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        Employee highestPaidEmployee=highestPaidEmp.get();
        System.out.println("=====================================");
        System.out.println("Highest paid employee : ");
        System.out.println("=====================================");
        System.out.println("ID : "+highestPaidEmployee.getId());
        System.out.println("Name : "+highestPaidEmployee.getName());
        System.out.println("Age : "+highestPaidEmployee.getAge());
        System.out.println("Gender : "+highestPaidEmployee.getGender());
        System.out.println("Department : "+highestPaidEmployee.getDepartment());
        System.out.println("YearOfJoining : "+highestPaidEmployee.getYearOfJoining());
        System.out.println("Salary : "+highestPaidEmployee.getSalary());
        System.out.println();
        System.out.println("===================================");
        //Get the names of all employees who have joined after 2015?
        employeeList.stream().filter(e->e.getYearOfJoining()>2015)
                .map(Employee::getName).forEach(e-> System.out.println(e));

        System.out.println("===================================");
        //Count the number of employees in each department?
        Map<String ,Long>countOfEmp=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println("No of employees in each department : ");
        System.out.println("===================================");
        countOfEmp.forEach((dept,count)-> System.out.println(dept+" : "+count));
        System.out.println("===================================");


        //What is the average salary of each department?
        Map<String,Double> avgSalaryOfDept=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        avgSalaryOfDept.forEach((dept,avg)-> System.out.println(dept+" : "+avg));
        System.out.println("===================================");

        //Get the details of youngest male employee in the product development department?
        Optional<Employee> youngestEmp=employeeList.stream().filter(i->i.getGender()=="Male" && i.getDepartment()=="Product Development")
                .collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge)));
        System.out.println("Youngest enployee details : ");
        System.out.println("===================================");
        Employee youngestEmployee=youngestEmp.get();
        System.out.println("Id : "+youngestEmployee.getId());
        System.out.println("Name : "+youngestEmployee.getName());
        System.out.println("Age : "+youngestEmployee.getAge());
        System.out.println("Gender : "+youngestEmployee.getGender());
        System.out.println("Department : "+youngestEmployee.getDepartment());
        System.out.println("YearOfJoining : "+youngestEmployee.getYearOfJoining());
        System.out.println("Salary : "+youngestEmployee.getSalary());
        System.out.println("===================================");

        //Who has the most working experience in the organization?
        Optional<Employee>oldestEmp=employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        Employee oldestEmployee=oldestEmp.get();
        System.out.println("===================================");
        System.out.println("Id : "+oldestEmployee.getId());
        System.out.println("Name : "+oldestEmployee.getName());
        System.out.println("Age : "+oldestEmployee.getAge());
        System.out.println("Gender : "+oldestEmployee.getGender());
        System.out.println("Department : "+oldestEmployee.getDepartment());
        System.out.println("YearOfJoining : "+oldestEmployee.getYearOfJoining());
        System.out.println("Salary : "+oldestEmployee.getSalary());
        System.out.println("===================================");


        //: How many male and female employees are there in the sales and marketing team?
        Map<String,Long> howManyEmpInSalesAndMarketing=employeeList.stream().filter(i->i.getDepartment()=="Sales And Marketing")
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(howManyEmpInSalesAndMarketing);
        System.out.println("===================================");

        //What is the average salary of male and female employees?
        Map<String,Double >avgSalaryOFMaleAndFemale =employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryOFMaleAndFemale);
        System.out.println("===================================");

        //List down the names of all employees in each department?
        Map<String,List<Employee>>employeeineachdept=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        Set<Map.Entry<String, List<Employee>>> entrySet = employeeineachdept.entrySet();

        for (Map.Entry<String, List<Employee>> entry : entrySet)
        {
            System.out.println("--------------------------------------");

            System.out.println("Employees In "+entry.getKey() + " : ");

            System.out.println("--------------------------------------");

            List<Employee> list = entry.getValue();

            for (Employee e : list)
            {
                System.out.println(e.getName());
            }
        }

        System.out.println("===================================");


        //What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics stats=employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average salary : "+stats.getAverage());
        System.out.println("Total Salary : "+stats.getSum());
        System.out.println("===================================");

        //Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        System.out.println("===================================");
        Map<Boolean,List<Employee>>partioningByAge=employeeList.stream().collect(Collectors.partitioningBy(e->e.getAge()>25));
        Set<Map.Entry<Boolean, List<Employee>>> entrySet1 = partioningByAge.entrySet();

        for (Map.Entry<Boolean, List<Employee>> entry : entrySet1)
        {
            System.out.println("----------------------------");

            if (entry.getKey())
            {
                System.out.println("Employees older than 25 years :");
            }
            else
            {
                System.out.println("Employees younger than or equal to 25 years :");
            }

            System.out.println("----------------------------");

            List<Employee> list = entry.getValue();

            for (Employee e : list)
            {
                System.out.println(e.getName());
            }
        }

        System.out.println("=======================================");


        //Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Optional<Employee> oldEmp=employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        Employee oldEmployee=oldEmp.get();
        System.out.println("Name : "+oldEmployee.getName());
        System.out.println("Age : "+oldEmployee.getAge());
        System.out.println("Department : "+oldEmployee.getDepartment());

        Map<String,Long>empcount=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(empcount);







    }







}
