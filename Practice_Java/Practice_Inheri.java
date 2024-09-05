package harshad;
class Pract{
	int l;
	int w;
	Pract (){
		System.out.println("I am default constructor");
	}
	Pract(int a, int b){
	        a=l;
		    b=w; 
	}
	public int RectArea() {
		return l*w;
	}
	public int RectPeri() {
		return 2*l+2*w; 
	}
}

class Practo extends Pract{
	int h;
	Practo(int c){
		c = h;
	}
	public int CubArea() {
	return 2*(l*w+w*h+h*l);   	
	}
	public int CubVol() {
		return l*w*h;
	}
}
public class Practice_Inheri {

	public static void main(String[] args) {
		Pract obj = new Pract(5,3);
		Practo obj2 = new Practo(6);
		System.out.println(obj.RectArea());
		System.out.println(obj.RectPeri());
		System.out.println(obj2.CubArea());
		System.out.println(obj2.CubVol());
	}

}
