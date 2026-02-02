package String.CustomImmutable;
class Address{
    private String city;
    Address(String city){
        this.city=city;
    }
    //setter method

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}

class Employee{
    private final int id;
    private final Address address;

    Employee(int id,Address address){
        this.id=id;
        //defensive copy
        this.address=new Address(address.getCity());
    }

    public int getId() {
        return id;
    }

    public Address getAddress() {
        //getter defensive copy
        return new Address(address.getCity());
    }
}
public class CustomImmutableClassWithMutableObject {
    public static void main(String[] args) {
        Address addr=new Address("Pune");
        Employee emp=new Employee(1,addr);
        addr.setCity("Mumbai");
        System.out.println(emp.getAddress().getCity());
    }
}
