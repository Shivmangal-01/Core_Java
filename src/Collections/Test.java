package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{
    int id;
    String name;
    float marks;
    Student(int id,String name,float marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return  id+"  "+name+"  "+marks;
    }
}

class SortIdDescendingOrder implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.id,o1.id);
    }
}

class SortMarksAscending implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(o1.marks,o2.marks);
    }
}


public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student(3,"Shiv",90));
        list.add(new Student(1,"Vishu",98));
        list.add(new Student(4,"Komal",97));
        list.add(new Student(2,"Shiva",99));
        list.add(new Student(5,"Manu",89));

        //sorting id in descending order (using comparator)
//        Collections.sort(list,new SortIdDescendingOrder());
//        for(Student s:list){
//            System.out.println(s);
//        }

        //sorting marks in ascending order (using comparator)
//        Collections.sort(list,new SortMarksAscending());
//        for(Student s:list){
//            System.out.println(s);
//        }

        //natural sorting by name(Comparable)
        Collections.sort(list);
        for (Student s:list){
            System.out.println(s);
        }
    }
}
