package harshad;
class Mymainemployee {
	private int id;
    private String name;
    private int salary;
	
	/*public void setName(String n) {
		this.name = n;
	}*/
	public String getName() {
		return name;
	}
	/*public void setId(int i) {
		this.id = i;
	}*/
	public int getId() {
		return id;
	}
	public int getSalary() {
		return salary;
	}
	/*public Mymainemployee() {
		id = 45;
		name = "Harsh";
	}*/
	public Mymainemployee(String myname,int myid) {
		id = myid;
		name = myname;
	}
	public Mymainemployee(int mysalary) {
		id = 1;
		name = "Khan";
		salary = mysalary;
	}
}
public class Constructor {

	public static void main(String[] args) {
	Mymainemployee harry = new Mymainemployee("Khanna",12);
	System.out.println(harry.getId());
	System.out.println(harry.getName());
	System.out.println(harry.getSalary());
	}
}