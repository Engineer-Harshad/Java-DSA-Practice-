package harshad;
class Mythread1 extends Thread{
	@Override
	public void run() {
		int i = 0;
		while(i<50) {
		System.out.println("My thread is running...");
		System.out.println("I am happy...");
		i++;
		}
	}
}

class Mythread2 extends Thread{
	@Override
	public void run() {
		int i = 0;
		while(i<50) {
		System.out.println("Thread 2 is running...");
		System.out.println("I am sad...");
		i++;
		}
	}
}
public class Threading {

	public static void main(String[] args) {
	Mythread1 t1 = new Mythread1();
	Mythread2 t2 = new Mythread2();
	t1.start();
	t2.start();
	}

}
