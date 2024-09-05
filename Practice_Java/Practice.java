package harshad;

/*class kamgar{
	int salary;
	String name;
	
	public int getSalary() {
		return salary;
	} 
	
	public String getName() {
		return name;
	}
	
    public void setName(String n) {
	name = n;
  }
}
*/

/*class cellphone{
	
	public void ringing() {
		System.out.println("Ringing");
	}
	public void vibrating() {
		System.out.println("Vibrating");
	}
	
}*/

class Square{
	int side;
	public int side() {
		return side;
	}
	public int area() {
		return  side * side;
	}
	public int peri() {
		return  4*side;
	}
}
public class Practice {

	public static void main(String[] args) {
		/*kamgar suraj = new kamgar();
		suraj.setName("Something");
		suraj.salary = 34;
		System.out.println(suraj.getSalary());
		System.out.println(suraj.getName());
		*/
		/*cellphone samsung = new cellphone();
		samsung.ringing();
		samsung.vibrating();*/
		
		Square ABCD = new Square();
		ABCD.side = 9;
		System.out.println(ABCD.area());
		System.out.println(ABCD.peri());
	}
}
