package harshad;

class Myemployee{
	private int id;
	private String name;
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setId(int i) {
		id = i;
	}
	public int getId() {
		return id;
	}
}
public class Getter_setter {

	public static void main(String[] args) {
		Myemployee raju = new Myemployee();
		// raju.id = 12;
		// raju.name = "Mighty raju";
		raju.setName("Rastogi");
		raju.setId(20);
		System.out.println(raju.getName());
		System.out.println(raju.getId());
	}
}
