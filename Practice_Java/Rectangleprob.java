package harshad;
class rectangle{
	private int l;
	private int b;
	
	public rectangle() {
		this.l = 9;
		this.b = 10;
	}
	public rectangle(int l,int b) {
		this.l = l;
		this.b = b;
	}
	public int getlength() {
		return l;
	}
	public int getbreadth() {
		return b;
	}
}
public class Rectangleprob {

	public static void main(String[] args) {
		rectangle r = new rectangle(4,5);
		System.out.println(r.getlength());
		System.out.println(r.getbreadth());
	}

}
