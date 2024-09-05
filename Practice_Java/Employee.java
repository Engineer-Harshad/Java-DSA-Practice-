package harshad;

class worker{
	int id;
	String name;
	int salary;
	public void  printDetails(){
		System.out.println("My id is " + id);
		System.out.println("and my name is " + name);
	}
	
	public int getSalary() {
		return salary;
	}
}

public class Employee {

	public static void main(String[] args) {
		worker abhi = new worker(); // Instantiating a new worker object
		worker harsh = new worker(); 
		// Setting properties/attributes for abhi
		abhi.id = 12;  
		abhi.salary = 34;
		abhi.name = "Brother";
		// Setting properties/attributes for harsh
		harsh.id = 13;
		harsh.salary = 12;
		harsh.name = "Deshmukh";
		// Printing properties/attributes
		// System.out.println(abhi.id);
		// System.out.println(abhi.name);
		abhi.printDetails();
		harsh.printDetails();
		int salary = abhi.getSalary();
		System.out.println(salary);
		
	}
}
