class A{
	//By default 0 para constructor created ONLY IF NO COnstructor is given
//If we create our own constructor then 0 para constructor will not be created by JVM
	A(String s){
		System.out.println("Parent constructor");
	}
}
class B extends A{
	B(String s){
		// If super is not there it will give compile error BECAUSE if 
		// ...if you add nothing first line of compiler is super() with no parameter
 //...and in parent we have no default constructor , as we have given parameter cons
		//..so we need to add parameter super(s) call  as parent constructor
		// IF parent has no cons by default no para constructor is created and called
		//after parent call the child constructor is called
		
		super(s);
		
		//Add this("20") to call some other constructor of same class if you have 
		//multiple different parameter constrctors 
		//super()/this() should be the first line of constructor and both cannot be used
		//only 1 will be used super() or this()

		System.out.println("Child constructor");
		
	}
}
public class ConstructorChaining {
public static void main(String[] args) {
	A a  = new B("parameter");
}
}
