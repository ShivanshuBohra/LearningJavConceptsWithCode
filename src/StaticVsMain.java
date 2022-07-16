

public class StaticVsMain {
	
	public StaticVsMain() {
		System.out.println("constructor");
	}
	
// static method will run only once at the beginning before object creation
	// so it is used to initialize value only once , as constructor called for every object created
	static  {
		System.out.println("static");
	}
	static  {
		System.out.println("static2");
	}
	
	//static block cannot be created inside main
public static void main(String[] args) {
	
	// constructor will be called everytime object is created
	StaticVsMain d = new StaticVsMain();
	StaticVsMain d2 = new StaticVsMain();
	
	
	// sysout called in sequence ..after 2 contructor main will be called 
	System.out.println("main");
	
	StaticVsMain d3 = new StaticVsMain();
	
}
}
