class Address{
	String city, state;

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	
}

class Employee{
	int id;
	String name;
	Address address;
	public Employee(int id, String name, Address address) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.address = address;
		
	}
	
	public void display() {
		System.out.println(id + name + address.city + address.state);
	}
}
public class Aggregation {
	public static void main(String[] args) {
		Address address = new Address("pune", "MH");
		Address address2 = new Address("mumbai", "MH");
		
		Employee emp = new Employee(1, "shiv", address);
		Employee emp2 = new Employee(2, "aayush", address2);
		
		emp.display();
		emp2.display();
	}
	


}
