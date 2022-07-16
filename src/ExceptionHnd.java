import java.io.IOException;

class Xyz{
	public void div(int a) {
		
	int z= 10/a;
	if(z<6){
		throw new MyException("number less then 6");
	}
	System.out.println(z);
		
		
	}
}

// RuntimeException is unchecked ex. so no need to handle 
// If we extend Exception class then it will be checked ex. and we will need throws or try catch bloc
class MyException extends RuntimeException{
	public MyException(String e) {
		// the message passed is sent to RE and then to exception and then to throwable
		// throwable needs this message and call .printStackTrace
		super(e);
	}
}



public class ExceptionHnd {
	public static void main(String[] args)  {
		Xyz obj = new Xyz();
		obj.div(2);
		obj.div(0);
	}

}
