
class OveloadingEX{

	public void add(int a , int b){
		int sum = a+b;
		System.out.println(sum);
	}
	//in same class
	//return type can be different in overirding
	//access modifier can be changes to any.
	//no rule for exception handling
	// different argument type or sequence or number
	public int add(int a , int b, int c){
		int sum = a+b+ c;
		System.out.println(sum);
		return sum;
	}
	
}

class OverridingEX extends OveloadingEX{
	// can be in different class
	// cannot OVERIDE STATIC or PRIVATE methods : private method not accessed in child 
//Static are declared before object creation but overiding is runtime on basis of object so cannot overide static method
	// if child through checked excep. parent must through same or parent ex. no wule for uncheckedexp.
	// same name and arguments as parent
// child return type should be subtype of parent type (to show use Object in parent and string in child)
//access modifiers can be increased in child :public in parent must be  publicin child , 
	//Protected can be converted into protected or public : scope can be increated
	// privete cannot be overiden , cannot access
	
	public void add(int a , int b){
		int sum = a+b;
		System.out.println("overide method sum  = "+ sum);
	}
	
	
}
public class Polymorphism {
	
	
	
public static void main(String[] args) {
	OveloadingEX obj = new OveloadingEX();
	obj.add(1, 2, 3);
	obj.add(1, 2);
	
	
	OveloadingEX obj1 = new OverridingEX();
	obj1.add(1, 2);
}
}
