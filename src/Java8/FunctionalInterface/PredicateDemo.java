package Java8.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
class Employee{
    int id;
    String name;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Employee>list=new ArrayList<>();
        list.add(new Employee(1,"a"));
        list.add(new Employee(2,"b"));
        list.add(new Employee(3,"z"));
        //System.out.println(list);
        Predicate<Employee>p3=e->e.id>2;
        for(Employee e1:list){
            if(p3.test(e1)){
                System.out.println(e1.id+" "+e1.name);
            }
        }
    }
}
public class PredicateDemo {
    public static void main(String[] args) {
        String []str={"java","java8","spring","springBoot","hibernate"};

        Predicate<String> p=(s)->s.length()>5;
        System.out.println(p.test("Java Programs"));

        Predicate<Integer>p2=(i)->i%2==0;
        System.out.println(p2.test(12));
        System.out.println(p2.test(9));

        Predicate<String>p3=(a)->a.length()>5;
        for(String i:str){
            if(p3.test(i)){
                System.out.println(i);
            }
        }



    }
}
