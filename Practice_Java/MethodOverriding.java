package harshad;
class Meth1{
	public int a;
	public int mymeth1() {
		return 4;
	}
	public void mymeth2() {
		System.out.println("I am mymeth2 method of Meth1 class");
	}
}

class Meth2 extends Meth1{
	public void mymeth3() {
		System.out.println("I am mymeth3 method");
	}
	@Override
	public void mymeth2() {
		System.out.println("I am mymeth2 method of Meth2 class");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Meth1 A = new Meth1();
		A.mymeth2();
		Meth2 B = new Meth2();
		B.mymeth2();
	}

}
