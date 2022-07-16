import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PredicateEx {
	public static void main(String[] args) {
		
		Employe emp1 = new Employe(400, "shivanshu");
		Employe emp2 =  new Employe(500, "ayush");
		Employe emp3 =  new Employe(600, "Bohra");
		
		ArrayList<Employe> al = new ArrayList<Employe>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		
		// define predicate interface Test method it returns true if condition satisfy 
		Predicate<Employe> predicate = (emp) -> emp.id >500;
		
		for (Employe emp : al) {
			// use the test method defination
			if(predicate.test(emp)) {
				System.out.println(emp);
			}
		}
		
		//Stream provides predefined method eg.filter, map , for each which can be used over collection
		// STream used to process bulk objects of collection eg to print all calues greater then 15
	//STream is a iterator class that allows to process collections of objects in functional manner(i.e we can use lamda's)
		//Collection can store data but STream are only used to perform some functions in Collection
		// you cannot traverse over a stream multiple times but in Collection you can
		// you cannot add,remove element in STream
	//	Using Stream in java8;
		
		// list.parrallelStream >> to allow multithreading
		List<Employe> empObj = al.stream().filter((emp)->emp.id<500).collect(Collectors.toList());
		System.out.println(empObj);
		
	//Map : If you want to perform action on all elements of collection and put in another Stream
		//if you do not want filtering use .map(x -> x*X) your implementation
		
		//Stream
		long num = Stream.of(10,20,30,40,50).filter((x) -> x>20).count();
		System.out.println(num);
		
		//limit will set how many numner you want else it will go to infinite
		
		//forEach(x -> SYstem.out.printLn(X)) : below is same METHOD REFERENCE
		Stream.generate(Math :: random).limit(4).forEach(System.out :: println);
		
		
		
		
	}
	

}
