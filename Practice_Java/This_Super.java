package harshad;
class Ekclass{
	int a;
	Ekclass(int a){
		this.a=a;
	}
	public int getA() {
		return a;
	}
	public int returnone() {
		return 1;
	}
}
public class This_Super {

	public static void main(String[] args) {
		Ekclass e = new Ekclass(5);
		System.out.println(e.getA());
	}

}
