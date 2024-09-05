package Practice;

public class Strings {

	public static void main(String[] args) {
//		String a = "Table";
//		String b = "Table";
//		System.out.println(a==b);
//		System.out.println(a.equals(b));
//		String c = new String("Tabla");
//		String d = new String("Tabla ");
//		System.out.println(c==d);
//		System.out.println(c.equals(d));
//		pattern1(7);
		pattern2(5);
	}
	
//	static void pattern1(int n) {
//		for(int row = 1;row<=n;row++) {
//			for(int col = 1;col<=row;col++) {
//				System.out.print(col+" ");
//			}
//			System.out.println();
//		}
//	}
	
	static void pattern2(int n) {
		for(int row = 1;row<=2*n;row++) {
			int c = row>n?2*n-row:row;
			for(int space = 0;space<n-c;space++) {
				System.out.print(" ");
			}
			for(int col = c;col>=1;col--) {
				System.out.print(col+" ");
			}
			for(int col = 2;col<=c;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	

}