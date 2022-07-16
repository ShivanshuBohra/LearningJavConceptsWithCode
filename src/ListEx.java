import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ListEx{
public static void main(String[] args) {
	
	System.out.println("enter 5 numbers for list");
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	
	for (int i = 0 ; i<5 ;i++){
		al.add(sc.nextInt());
	}
	
	ListIterator<Integer> itr = al.listIterator();
	while(itr.hasNext()){
		int value = itr.next();
		System.out.println(value);
	}
	
	
}
}
