package CompositeDesign;

import java.util.ArrayList;

interface  Component{
	void showprice();
}

class Leaf implements Component{
int price ;
String name;
	public Leaf(int price, String name) {
	super();
	this.price = price;
	this.name = name;
}
	@Override
	public void showprice() {
		// TODO Auto-generated method stub
		System.out.println(name + " " + price);
		
	}

}

class Composite implements Component{
String name;
ArrayList< Component> al = new ArrayList<Component>();

public void addComponent(Component com) {
	al.add(com);
}
	public Composite(String name) {
	super();
	this.name = name;
}
	@Override
	public void showprice() {
		// TODO Auto-generated method stub
		System.out.println(name);
		for(Component c : al) {
			c.showprice();
		}
		
	}
	
}

public class ComputerPart{
	
}