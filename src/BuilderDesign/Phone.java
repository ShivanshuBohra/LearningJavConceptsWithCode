package BuilderDesign;

public class Phone {
 int Ram;
 String name;
 String OS;
 public Phone(int Ram, String name, String OS) {
	this.name = name;
	this.OS = OS;
	this.Ram = Ram;

}
 
 public String toString() {
	 return (name+  " " + OS + " " + Ram );
 }
}
