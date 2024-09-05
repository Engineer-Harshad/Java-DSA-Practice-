package harshad;

interface TVRemote{
	void onTV();
	void offTV();
}

interface SmartTVRemote extends TVRemote{
	void changeChannel();
	void youTube();
}

class Sample implements SmartTVRemote{
	public void changeChannel() {
		System.out.println("Changing channel");
	}
	public void youTube() {
		System.out.println("YouTube");
	}
	public void onTV() {
		System.out.println("On TV");
	}
	public void offTV() {
		System.out.println("Off TV");
	}
	public void Switch() {
		System.out.println("Switching...");
	}
}

/* abstract class Telephone{
	abstract void ring();
	abstract void lift();
	abstract void disconnect();
}

class SmartTelephone extends Telephone{
	void ring() {
		System.out.println("Ringing...");
	}
	void lift() {
		System.out.println("Lifting...");
	}
    void disconnect() {
		System.out.println("Disconnecting...");
	}
    void pickup() {
    	System.out.println("Picking the call");
    }
}*/
public class Tele_ProbSolve {

	public static void main(String[] args) {
		/*Telephone t = new SmartTelephone();
		t.disconnect();*/
		
		SmartTVRemote r = new Sample();
		r.changeChannel();
		r.onTV();
		// r.Switch(); --> Not allowed
	}
}
