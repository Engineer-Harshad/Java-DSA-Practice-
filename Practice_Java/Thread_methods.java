package harshad;
class MyNewThr1 extends Thread{
	public void run() {
		while(true) {
		System.out.println("Thank you!");
		try {
			Thread.sleep(455);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

class MyNewThr2 extends Thread{
	public void run() {
		while(true) {
		System.out.println("Thank you dear!");
		}
	}
}
public class Thread_methods {

	public static void main(String[] args) {
		MyNewThr1 t1 = new MyNewThr1();
		MyNewThr2 t2 = new MyNewThr2();
		t1.start();
		/*try {
			t1.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}*/
		t2.start();
	}

}
