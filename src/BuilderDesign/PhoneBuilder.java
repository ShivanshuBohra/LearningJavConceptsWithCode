package BuilderDesign;

public class PhoneBuilder {
	int Ram;
	 String name;
	 String OS;
	 public PhoneBuilder setRam(int ram) {
		this.Ram = ram;
		return this;
	}
	public PhoneBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public PhoneBuilder setOS(String oS) {
		this.OS = oS;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(Ram, name, OS);
	}
}
