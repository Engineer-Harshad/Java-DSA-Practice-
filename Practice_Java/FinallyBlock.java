package harshad;

public class FinallyBlock {
public static int greet() {
	try {
	/*int a=50,b=2;
	int res = a/b;
	return res;*/
		for(int i = 1; i<=5; i++) {
			if(i<6) {
				System.out.println("Print kardo");
			}
			break;
		}
		System.out.println("aageki cheez");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("Program is finished");
	}
	return 0;
}
	public static void main(String[] args) {
     int k = greet();
     System.out.println(k);
	}

}
