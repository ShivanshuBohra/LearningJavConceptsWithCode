import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(61);
		al.add(100);
		
		//filter all values greater then 20 and print its sqaure
		List<Integer> arrayList = al.stream().filter(x-> x>20).map(x-> x*x).collect(Collectors.toList());
		System.out.println(arrayList);
		
		//to remove duplicate set use  Collectors.toSet() > to take as set and remove duplicate
		
		//to find sum .mapToInt
		int sum =  al.stream().filter((x)->x%2==0).mapToInt(x-> x).sum();;
	     
	     
			System.out.println(sum);
	}

}
