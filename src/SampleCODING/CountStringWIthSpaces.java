package SampleCODING;

import java.util.HashMap;

public class CountStringWIthSpaces {
  public static void main(String[] args) {
	String str = "Shiv shiv Ayush Shiv radhe shiv Ayush";
	
	HashMap<String, Integer> hmap = new HashMap<String, Integer>();
	
	String[] strArray = str.split("\\s");
	for(String s : strArray) {
		if(hmap.containsKey(s)) {
			int count = hmap.get(s);
			hmap.put(s, ++count);
		}
		else
		{
		hmap.put(s, 1);
		}
		
	}
	System.out.println(hmap);
}
}
