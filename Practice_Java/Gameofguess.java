package harshad;
import java.util.Scanner;
import java.util.Random;
class game{
	//private int noOfGuesses;
	
	 int takeuserinput() {
		Scanner input = new Scanner(System.in);
		int takeip = input.nextInt();
		return takeip;
	}
	 int game() {
		Random random = new Random();
		int computerinput = random.nextInt(100);
		return computerinput;
	}
	 String iscorrect() {
		String result = (takeuserinput() == game()) ? "Congrats! You guessed correctly!" : "Try again buddy!";
		return result;
	}
	// public void set
}
public class Gameofguess {

	public static void main(String[] args) {
		System.out.println("Enter your number");
	game guessing = new game();
	guessing.takeuserinput();
	System.out.println(guessing.iscorrect());
	}

}
