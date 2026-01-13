package Collections.Set;

import java.util.LinkedHashSet;

class Studentdetails{
    int id;
    String name;
    Studentdetails(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class AddingCustomObjectsToLinkedHashSet {
    public static void main(String[] args) {
        //creating linkedhashset
        LinkedHashSet<Studentdetails> lset=new LinkedHashSet<>();

        //creating objects of StudentDetails
        Studentdetails st1=new Studentdetails(101,"A");
        Studentdetails st2=new Studentdetails(102,"B");
        Studentdetails st3=new Studentdetails(103,"C");
        lset.add(st1);
        lset.add(st2);
        lset.add(st3);

        for(Studentdetails s:lset){
            System.out.println("Id : "+s.id+"  Name : "+s.name);
        }


    }
}
