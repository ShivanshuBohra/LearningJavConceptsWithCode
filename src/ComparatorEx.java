import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentCompare{
	int rollNo;
	String name;
	StudentCompare(int rollNO , String name){
		this.rollNo = rollNO;
		this.name = name;
		
	}
	
	public String toString(){
		return (rollNo + "  " + name);
	} 
}

class SortByRoll implements Comparator<StudentCompare>{
	public int compare(StudentCompare o1 , StudentCompare o2){
		if(o1.rollNo>o2.rollNo){
			return 1;
		}
		else if(o1.rollNo== o2.rollNo) {
			return 0;
		}
		else
			return -1;
	}
	
}


public class ComparatorEx {
public static void main(String[] args) {
	

	StudentCompare s1 = new StudentCompare(2, "shivanshu");
	StudentCompare s2 = new StudentCompare(1, "shiv");
	StudentCompare s3 = new StudentCompare(5, "random");
	StudentCompare s4 = new StudentCompare(4, "ayush");
	
	ArrayList<StudentCompare> list = new ArrayList<StudentCompare>();
	list.add(s1);
	list.add(s3);
	list.add(s4);
	list.add(s2);
	SortByRoll sortByRoll = new SortByRoll();

	//   Collections.sort(list, new SortByRoll());
	
	Collections.sort(list, sortByRoll);
	
	for(StudentCompare s : list){
		System.out.println(s);
	}
	
	
	
//	Comparator<StudentCompare> cmp = new Comparator<StudentCompare>() {
//	
//	@Override
//	public int compare(StudentCompare o1, StudentCompare o2) {
//		
//		if(o1.rollNo>o2.rollNo){
//			return 1;
//		}
//		else if(o1.rollNo== o2.rollNo) {
//			return 0;
//		}
//		else
//			return -1;
//	}
//};
	
}	
	
}
