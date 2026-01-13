package Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

class EmpDetails{
    private int id;
    private String name;
    private double salary;

    public EmpDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id : "+id +"    Name : "+name +"     Salary  : "+salary ;
    }
}

//using another class
class ComparatorSortByName implements Comparator<EmpDetails>{
    @Override
    public int compare(EmpDetails o1, EmpDetails o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
public class ComparatorUsingAnonymous {
    public static void main(String[] args) {
        EmpDetails nikita=new EmpDetails(3,"nikita",100000);
        EmpDetails sarita=new EmpDetails(1,"sarita",90000);
        EmpDetails shubhangi=new EmpDetails(4,"shubhangi",80000);
        EmpDetails reshma=new EmpDetails(2,"reshma",91000);

        ArrayList<EmpDetails> list=new ArrayList<>();
        list.add(nikita);
        list.add(sarita);
        list.add(shubhangi);
        list.add(reshma);

        System.out.println("Brfore sorting");
        for (EmpDetails e:list){
            System.out.println(e);
        }

        //sorting using concrete class
        Collections.sort(list,new ComparatorSortByName());

        System.out.println("After sorting");
        for(EmpDetails e1:list){
            System.out.println(e1);

        }


        //sorting using anonymous class
        Comparator<EmpDetails> idComparator=new Comparator<EmpDetails>() {
            @Override
            public int compare(EmpDetails o1, EmpDetails o2) {
                return o1.getId()-o2.getId();
            }
        };
        Collections.sort(list,idComparator);
        System.out.println("After Sorting ");
        for(EmpDetails ed:list){
            System.out.println(ed);
        }



    }




}
