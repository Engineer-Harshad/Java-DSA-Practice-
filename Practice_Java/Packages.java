package harshad;
class c1 {
	public int x = 18;
	protected boolean b = false;
	int c = 15;
	private float y = 14.3f;
	public void meth() {
		System.out.println(x);
		System.out.println(b);
		System.out.println(c);
		System.out.println(y);
	}
}
public class Packages {
	public static void main(String[] args) {
		   c1 cls = new c1();
		   cls.meth();
		   System.out.println(cls.x);
		   System.out.println(cls.b);
		   System.out.println(cls.c);
		 //  System.out.println(cls.y);
		}
}

