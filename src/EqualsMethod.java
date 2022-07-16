class Student{
	int id;
	String name;
	Student(int id, String name){
		this.id= id;
		this.name= name;
	}
	
	//overiding .equals to get over own implementation
	
	public Boolean equals(Student obj){
		
		return (name.equals(obj.name));
		//return (id == obj.id);
		
	}
}

public class EqualsMethod {
	public static void main(String[] args) {
		Student obj1 = new Student(1, "SHivanshu") ;
				Student obj2 = new Student(2, "SHivanshu") ;
				Student obj3 = new Student(3, "name");

//.equals by default returns oreference comparion but in String class overidden to get value compariosion
//similary we can overide object class .equals to get own comparision
				System.out.println(obj1.equals(obj2));
		
	}
}
