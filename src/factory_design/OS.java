package factory_design;

public class OS {
	public static void main(String[] args) {

		/*
		 * OSInterface obj = new Anaroid(); obj.spec();
		 */
	
		// IF you want other class to give object use Factory design
		 FactoryBuilder fb = new FactoryBuilder(); OSInterface obj =
		fb.getinstance("dd"); obj.spec();
		 
		 
	}
}
