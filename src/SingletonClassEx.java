 
public class SingletonClassEx {
	
	private SingletonClassEx() {
		System.out.println("singleton class constructor");
	}
	
	private static SingletonClassEx singleInstance;
	
	public static SingletonClassEx getInstance() {
		if(singleInstance==null) { 
			singleInstance = new SingletonClassEx();
		}
		return singleInstance;
	}
	

}

 class SingletonClassImpl{
	 
	 public static void main(String[] args) {
		 SingletonClassEx.getInstance();
		 System.out.println("single");
		
	}
	
}

