package harshad;
/*class Rectangle{
	int l;
	int b;
	
	public int area() {
		return l*b;
	}
	public int peri() {
		return (2*l) + (2*b);
	}
}*/

class TommyVecetti{
	public void hitting() {
		System.out.println("hitting");
	}
    public void running() {
		System.out.println("running");
	}
    public void firing() {
	System.out.println("firing");
}
	
}
public class Practice2 {

	public static void main(String[] args) {
		/*Rectangle rect = new Rectangle();
		
		rect.l = 5;
		rect.b = 6;
		System.out.println(rect.area());
		System.out.println(rect.peri());
		*/
		TommyVecetti game = new TommyVecetti();
		game.hitting();
		game.running();
		game.firing();
	}

}
