

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.DefaultBoundedRangeModel;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

//functional interface with only one method 
//functional interface can have any number of static/default method

@FunctionalInterface 
// IF we anotate @Functional interface , now if we add 2nd abstract method Compile time error will be there
interface Sayable{
	public void say();
	
	static void run() {
		System.out.println("Running from static method");
	}
	default void walk() {
		System.out.println(" default method called");
	}
}


public class LamdaExpression {
public static void main(String[] args) {

	// we can create another class and implemet interface and use its object or use Anomys class
	//Anomys class is a class which ddoes not have a name.
// anomys class to inplement Interface , we can implement multiple methods if we have in interface
	
	/*
	 * Sayable sayable = new Sayable() { public void say() {
	 * System.out.println("working lamda"); } };
	 */
	
	
	
	// lamda expression reduces code 
	// No need to give functional interface name and its method name

	 Sayable sayable = ()-> { 
		 
		  System.out.println("working lamda");
		   };
	
	sayable.say();
	Sayable.run();
	
	
	
}
}