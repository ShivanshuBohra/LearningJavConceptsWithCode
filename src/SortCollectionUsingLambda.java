import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employe{
	int id;
	String name;
	Employe(int id , String name){
		this.id= id;
		this.name= name;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Emp id: "+ id + " Emp name: "+ name;
	}
}

public class SortCollectionUsingLambda {
	public static void main(String[] args) {
		Employe emp1 = new Employe(4, "shivanshu");
		Employe emp2 =  new Employe(9, "ayush");
		Employe emp3 =  new Employe(7, "Bohra");
		
		ArrayList<Employe> al = new ArrayList<Employe>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		System.out.println(al);
		
//		Collections.sort(al, new Comparator<Employe>() {
//
//			@Override
//			public int compare(Employe o1, Employe o2) {
//				// TODO Auto-generated method stub
//				if (o1.id>o2.id) {
//					return 1;
//				}
//				else if(o1.id<o2.id){
//					return -1;
//				}
//				return 0;
//			}
//		});
		
		// lamda can be implemeted instead of comparator anomys class
		// Type in Lamda can also be removed(o1, o2)->{}
				Collections.sort(al, (Employe o1, Employe o2)-> {
				// TODO Auto-generated method stub
					// use o1.name.compareTo(o2.name) : to compare name/string
				if (o1.id>o2.id) {
					return 1;
				}
				else if(o1.id<o2.id){
					return -1;
				}
				return 0;
		});
		System.out.println(al);
	}		
}
