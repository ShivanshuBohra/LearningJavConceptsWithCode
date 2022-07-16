package SampleCODING;

import java.util.HashMap;

public class CountOccuranceInString {
public static void main(String[] args) {
	
	String str = "ABCABCDCB";
	
	HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
	
	for(int i =0 ; i <str.length();i++) {
		if(hmap.containsKey(str.charAt(i))) {
			int count = hmap.get(str.charAt(i));
			hmap.put(str.charAt(i), ++count);
		}
		else {
			hmap.put(str.charAt(i), 1);
		}
	}
	System.out.println(hmap);
	
}
}
