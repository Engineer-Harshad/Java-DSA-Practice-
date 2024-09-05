package harshad;
class MyThr1 extends Thread{
	public MyThr1(String name) {
		super(name);
	}
	public void run() {
		int i = 0;
		while(i<200) {
		System.out.println("Thank you!" + this.getName());
		i++;
		}
	}
}
public class Thread_Priorities {

	public static void main(String[] args) {
		MyThr1 t1 = new MyThr1("Harshad");
		MyThr1 t2 = new MyThr1("Akbar");
		MyThr1 t3 = new MyThr1("Birbal");
		MyThr1 t4 = new MyThr1("Tansen(IMP)");
		MyThr1 t5 = new MyThr1("Arjun");
		t4.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t5.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
