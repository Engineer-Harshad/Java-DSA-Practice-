package harshad;

/* abstract class Phonne{
	int c = 5;
	abstract public void something();
}*/

class Phonne{
int c = 5;
 public void something() {
	 System.out.println("Something");
 };
}

interface Myname{
	int b = 4;
	void PlayMusic();
	void PlayVideo();
}
interface Myname2{
	void ringSound();
	private void greet() {
		System.out.println("Good Morning");
	}
	default void callHim() {
		greet();
		System.out.println("Call to him");
	};
}

class Smmartphone extends Phonne implements Myname,Myname2 {
	int b = 5;
	int c = 4;
	/* public void something() {
		System.out.println("Something");
	}*/
	public void PlayMusic() {
		System.out.println("Playing music");
	}
	public void PlayVideo() {
		System.out.println("Playing Video");
	}
	public void ringSound() {
		System.out.println("Ringing sound");
	}
} 

class Smartphone2 implements Myname,Myname2{
	public void PlayMusic() {
		System.out.println("Playing music again");
	}
	public void PlayVideo() {
		System.out.println("Playing Video again");
	}
	public void ringSound() {
		System.out.println("Ringing sound again");
	}
	public void callHim() {
		System.out.println("I am default method callHim");
	}
}
public class Java_Interfaces {

	public static void main(String[] args) {
		Smmartphone s = new Smmartphone();
		// System.out.println(s.b); 
		// System.out.println(s.c); 
		// s.PlayVideo();
		// s.callHim();
		Smartphone2 s2 = new Smartphone2();
		// s2.PlayVideo();
		s.callHim();
		s.PlayMusic();
		s.ringSound();
		s.something();
		
		//Polymorphism 
		Myname n = new Smartphone2();
		n.PlayMusic();
		n.PlayVideo();
		Phonne p = new Smmartphone();
		p.something();
		// p.PlayMusic(); --> Not allowed
		Myname nam = new Smmartphone();
		nam.PlayMusic();
		// nam.ringSound(); --> Not allowed 
		
	}

}
