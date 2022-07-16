import java.util.HashMap;
import java.util.TreeMap;

public class SortHmapByKey {
public static void main(String[] args) {
	//By default hmap does not store insertion order so to srt convert in treemap
	HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	hmap.put(4, "Shiv");
	hmap.put(2, "AShiv");
	hmap.put(7, "ZShiv");
	
	TreeMap<Integer, String> tMap = new TreeMap<Integer, String>(hmap);
	System.out.println(tMap);
}
}
