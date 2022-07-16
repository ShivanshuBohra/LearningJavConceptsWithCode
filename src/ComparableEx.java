import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

class StudentComapare implements Comparable<StudentComapare>{
	int id;
	int rollNo;
	String name;
	
	StudentComapare(int id, int rollNo, String name){
		this.id= id;
		this.rollNo = rollNo;
		this.name = name;
		
	}
	@Override
	// to use Collections.sort classes must implement comparable
		// list and String class implements this for sorting ascending
		// we can overide compareTo method for our own implementation
		
	public int compareTo(StudentComapare s) {
		
		if(this.id>s.id){
			return 1;
		}
		else if(this.id==s.id){
			return 0;
		}
		else{
			return -1;
		}
		

	}
	
	 //overide toString so that printing object will not give default imp. classname@hashcode
		public	String toString(){
				return (id + "  " + rollNo + "  " +name);
			}
			
	
	
	
	
}

public class ComparableEx {

	public static void main(String[] args) {
		StudentComapare student1 = new StudentComapare(9, 1, "shivanshu");
		StudentComapare student2 = new StudentComapare(7, 8 , "ayush");
		StudentComapare student3 = new StudentComapare(88, 1, "Shiv");
			ArrayList<StudentComapare> list = new ArrayList<>();
			list.add(student1);
			list.add(student2);
			list.add(student3);
			 
			
		Collections.sort(list);
			
			for(StudentComapare s : list){
				System.out.println(s);
			}
			
			
				
				
	}
	
}
