package harshad;
class Base{
	//int x;
	
	/*public void setValue(int x) {
		System.out.println("This is value setting now");
		this.x = x;
	}*/
	/*public int getValue() {
		return x;
	}*/
	/*public void printme() {
		System.out.println("This is a method");
	}*/
	
	public Base() {
		System.out.println("I am a constructor");
	}
	public Base(int x) {
		System.out.println("I am an overloaded constructor " + x);
	}
}

class Derived extends Base{
	/*int y;
	public void sety(int y) {
		this.y = y;
	}
	public int gety() {
		return y;
	}*/
	public Derived() {
		// super(5);
		System.out.println("I am derived constructor");
	}
	public Derived(int x, int y) {
		super(x);
		System.out.println("I am overloaded constru of derived "+ y);
	}
}

class childDerived extends Derived{
	childDerived(){
		System.out.println("I am an childderived constructor");
	}
	childDerived(int x, int y, int z){
		super(x,y);
		System.out.println("I am an overloaded childderived constructor " +z);
	}
}
/*class Animal{
	String str;
	public void setType(String s) {
		str = s;
	}
	public String getType() {
		return str;
	}
}
class Dog extends Animal{
	String action;
	public void setAction(String act){
		action = act;
	}
	public String getAction() {
		return action;
	}
}*/
public class Inheritance {

	public static void main(String[] args) {
		//Base b = new Base();
		//Derived d = new Derived();
		//Derived f = new Derived(20,22);
		//childDerived cd = new childDerived();
		childDerived cd = new childDerived(12,13,26);
		/*b.setValue(5);
		System.out.println(b.getValue());
		Derived d = new Derived();
		d.setValue(53);
		System.out.println(d.getValue());
		d.sety(52);
		System.out.println(d.gety());*/
		
		
		/*Animal a = new Animal();
		a.setType("KingKobra");
		System.out.println(a.getType());
		Dog d = new Dog();
		d.setType("Moongoose");
		System.out.println(d.getType());
		d.setAction("Speak");
		System.out.println(d.getAction());*/
	}
}
