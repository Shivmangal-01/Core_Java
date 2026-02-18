package Java8.StreamAssesment;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Emp {
    private String empId;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String newJoiner;
    private int salary;
    private int rating;

    public Emp(String empId, String firstName, String lastName, String email, String gender, String newJoiner, int salary, int rating) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.newJoiner = newJoiner;
        this.salary = salary;
        this.rating = rating;
    }

    public String getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getNewJoiner() {
        return newJoiner;
    }

    public int getSalary() {
        return salary;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId='" + empId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", newJoiner='" + newJoiner + '\'' +
                ", salary=" + salary +
                ", rating=" + rating +
                '}';
    }

    public static void main(String[] args) {
        List<Emp> list=new ArrayList<>();
        list.add(new Emp("101","Shiv","Biradar","Shiv@gmail.com","FEMALE","True",1000000,1));
        list.add(new Emp("103","Komal","Biradar","komal@gmail.com","FEMALE","False",900000,3));
        list.add(new Emp("105","Manu","Biradar","manu@gmail.com","MALE","True",120000,0));
        list.add(new Emp("102","Sanchu","Sontakke","sanchu@gmail.com","FEMALE","False",60000,2));
        list.add(new Emp("104","Kapil","Sontakke","kapil@gmail.com","MALE","True",90000,4));
        //System.out.println(list);

        //emp list with gender as female
        list.stream().filter(e->e.getGender().equals("FEMALE")).forEach(e-> System.out.println(e));
        System.out.println();
        System.out.println("==========================================");

        //list the employee who are new joiners
        list.stream().filter(e->e.getNewJoiner().equals("True")).forEach(e-> System.out.println(e));
        System.out.println();
        System.out.println("==========================================");

        //sort the emp list by rating in asc
        list.stream().sorted(Comparator.comparingInt(Emp::getRating)).forEach(e-> System.out.println(e));
        System.out.println();
        System.out.println("==========================================");

        //sorting by rating in desc
        list.stream().sorted(Comparator.comparing(Emp::getRating).reversed()).forEach(System.out::println);
        System.out.println();
        System.out.println("==========================================");

        //sort the employee list by both rating and salary
        list.stream().sorted(Comparator.comparing(Emp::getSalary))
                .sorted(Comparator.comparing(Emp::getRating))
                .forEach(e-> System.out.println(e));
        System.out.println();
        System.out.println("==========================================");

        //another way
        list.stream().sorted(Comparator.comparing(Emp::getSalary).thenComparing(Emp::getRating)).forEach(e-> System.out.println(e));
        System.out.println();
        System.out.println("==========================================");

        //list all employee with salary more than 90000
        list.stream().filter(e->e.getSalary()>100000).forEach(e-> System.out.println(e));
        System.out.println();
        System.out.println("==========================================");

        //employee with highest salary
        Optional<Emp>res=list.stream().max((Comparator.comparing(Emp::getSalary)));
        res.ifPresent(System.out::println);
        System.out.println();
        System.out.println("==========================================");

        //finding second highest salry
        Optional<Emp>secondHighestSalary=list.stream().sorted(Comparator.comparing(Emp::getSalary).reversed()).skip(1).findFirst();
        secondHighestSalary.ifPresent(System.out::println);
        System.out.println();
        System.out.println("==========================================");

        //employee with minimun salary
        list.stream().min(Comparator.comparing(Emp::getSalary)).ifPresent(System.out::println);
        System.out.println();
        System.out.println("==========================================");

        //group the employees by gender
        Map<String,List<Emp>> resultList=list.stream().collect(Collectors.groupingBy(Emp::getGender));
        System.out.println(resultList);
        System.out.println();
        System.out.println("==========================================");

        //count of male and female employees
        Map<String,Long>count=list.stream().collect(Collectors.groupingBy(Emp::getGender,Collectors.counting()));
        System.out.println(count);
        System.out.println();
        System.out.println("==========================================");






    }
}
