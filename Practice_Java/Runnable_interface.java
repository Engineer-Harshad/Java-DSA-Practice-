package harshad;

class MyThreadRunnable1 implements Runnable{
	public void run() {
		System.out.println("I am cool boy");
		System.out.println("I am cool boy");
		System.out.println("I am cool boy");
		System.out.println("I am cool boy");
		System.out.println("I am cool boy");
		System.out.println("I am cool boy");
		System.out.println("I am cool boy");
		System.out.println("I am cool boy");
		System.out.println("I am cool boy");
		System.out.println("I am cool boy");
	}
}
class MyThreadRunnable2 implements Runnable{
	public void run() {
		System.out.println("You are fool boy");
		System.out.println("You are fool boy");
		System.out.println("You are fool boy");
		System.out.println("You are fool boy");
		System.out.println("You are fool boy");
		System.out.println("You are fool boy");
		System.out.println("You are fool boy");
		System.out.println("You are fool boy");
		System.out.println("You are fool boy");
		System.out.println("You are fool boy");
	}
}

public class Runnable_interface {

	public static void main(String[] args) {
		MyThreadRunnable1 b1 = new MyThreadRunnable1();
		Thread t1 = new Thread(b1);
		MyThreadRunnable2 b2 = new MyThreadRunnable2();
		Thread t2 = new Thread(b2);
		t1.start();
		t2.start();
	}

}
