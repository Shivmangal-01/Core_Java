package Collections.Set;

import java.util.HashSet;

class Student{
    int id;
    String name;
    float marks;
    Student(int id,String name,Float marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
}
public class UserDefinedObjectHashSet {
    public static void main(String[] args) {
        HashSet<Student> set=new HashSet<>();
        Student stud1=new Student(1,"XYZ",90.8f);
        Student stud2=new Student(2,"ABC",99.9f);
        Student stud3=new Student(3,"PQR",80.5f);

        set.add(stud1);
        set.add(stud2);
        set.add(stud3);

        //Traversing Hashset
        for(Student s:set){
            System.out.println(s.id+"  "+s.name+" "+s.marks);
        }
    }
}
