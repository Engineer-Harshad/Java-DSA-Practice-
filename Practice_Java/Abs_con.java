package harshad;

abstract class Parent{
	public void meth1() {
		System.out.println("I am method 1 of parent");
	}
	public void meth2() {
		System.out.println("I am method 2 of parent");
	}
	abstract void doThis();
}

class Child extends Parent{
	void doThis() {
		System.out.println("I am doThis method of abstract class");
	}
	public void meth3() {
		System.out.println("I am method 3 of child class");
	}
}

abstract class Child2 extends Parent{
	public void meth4() {
		System.out.println("I am method 4 of child2 class");
	}
}

public class Abs_con {

	public static void main(String[] args) {
		Parent p = new Child();
		p.meth2();
		p.doThis();
	}
}
