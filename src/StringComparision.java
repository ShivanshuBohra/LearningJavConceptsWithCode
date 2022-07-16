
public class StringComparision {
public static void main(String[] args) {
	
	String s1 = new String("aa");
	String s2 = "aa";
	String s3 = "aa";
	String s4 = new String("aa");
	
	// False as s1 is created with new Keyword
	System.out.println(s1==(s2));
	//true as both saved in same String Pool
	System.out.println(s2==(s3));
	// False as s4 is created with new Keyword
	System.out.println(s3==(s4));
}
}
