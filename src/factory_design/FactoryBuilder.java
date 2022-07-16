package factory_design;

public class FactoryBuilder {
   public OSInterface getinstance(String str) {
	   if(str.equals("anaroid"))
		   return new Anaroid();
	   else
		   return new Window();
   }
}
