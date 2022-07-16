package BuilderDesign;

public class Shop {
public static void main(String[] args) {
	/*
	 * Phone phone = new Phone(4, "samsung", "IOS"); 
	 * System.out.println(phone);
	 */
	
	// if you do not want all values to be passed in object
	Phone phone = new PhoneBuilder().setName("samsung").setOS("anaroid").getPhone();
	System.out.println(phone);
	
}
}
