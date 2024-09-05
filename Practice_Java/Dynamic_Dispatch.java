package harshad;

class Phone{
	public void propose() {
		System.out.println("Love You");
	}
	public void name() {
		System.out.println("My name is King");
	}
}

class SmartPhone extends Phone{
	public void izhaar() {
		System.out.println("Afreen Afreen");
	}
	@Override
	public void name() {
		System.out.println("My name is Raja");
	}	
}
public class Dynamic_Dispatch {

	public static void main(String[] args) {
		/*Phone obj = new Phone();
		SmartPhone objs = new SmartPhone();
		obj.name();*/
		Phone obj = new SmartPhone();
		// SmartPhone objs = new Phone(); // Not allowed
		obj.propose();
		obj.name(); 
		// obj.izhaar();
	}
}
