import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SortHmapByValue {
	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("Shiv", 3);
		hmap.put("aShiv", 9);
		hmap.put("zShiv", 7);

		//	hmap.entrySet()  >> returns all the key value mapping in list 
		// use Map.Entry<String, Integer> to store entrySet

		List<Map.Entry<String, Integer>> list = 
				new ArrayList<Map.Entry<String,Integer>>(hmap.entrySet());;
				System.out.println(list);

				//once you have list you can sort using Comparator
				Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

					@Override
					public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
						// TODO Auto-generated method stub
						return o1.getValue()-o2.getValue();
						//if need to compare String
						//	return o1.getKey().compareToIgnoreCase(o2.getKey());
					}
				});

				System.out.println(list);

	}
}