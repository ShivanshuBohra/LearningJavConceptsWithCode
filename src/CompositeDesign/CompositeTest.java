package CompositeDesign;

public class CompositeTest {
public static void main(String[] args) {
	
	Composite computer = new Composite("computer");

	Component mouse = new Leaf(200, "mouse");
	Component keyboard = new Leaf(500, "keyboard");
	Component Ram = new Leaf(400, "ram");
	
	Composite ph = new Composite("peri");
	Composite mb = new Composite("MB");
	
	ph.addComponent(mouse);
	ph.addComponent(keyboard);
	
	mb.addComponent(Ram);
	
	mouse.showprice();
	ph.showprice();
	mb.showprice();
	
	computer.addComponent(ph);
	computer.addComponent(mb);
	
	computer.showprice();
	
}
}
