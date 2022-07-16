import java.awt.List;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEX {
public static void main(String[] args) {
	HashMap<Integer, String> hmap = new HashMap<>();
	
	hmap.put(1, "one");
	hmap.put(2, "two00000000");
	hmap.put(3, "three");
	hmap.replace(2, "two");
	System.out.println(hmap);
	
	
	
Set<Integer> setOfKeys = hmap.keySet();
	
	Iterator<Integer> itr = setOfKeys.iterator();
	
	while(itr.hasNext()){
		// to show key ;; int value =itr.next();
		String value = hmap.get(itr.next());
		System.out.println(value);
	}
}
}
