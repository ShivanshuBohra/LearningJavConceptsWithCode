class Student1{
	int id ;
	String name;
	Student1(int id, String name){
		this.id = id;
		this.name= name;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + "]";
	}
	
	
}


public class ToString {
public static void main(String[] args) {
	Student1 obj1 = new Student1(1, "Shivanshu");
	Student1 obj2 = new Student1(2, "Random");
	
	System.out.println(obj1.id + " " + obj1.name);
	
	
	
// when be print object directly , object class .toString() method called  which prints classname@hashcode
	// to give our own implmentation overide .to STring method
	System.out.println(obj1);
	System.out.println(obj2);
}
}
