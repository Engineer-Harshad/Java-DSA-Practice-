package ycb;
public class Practice_session_new {
	public static void main(String[] args) {
		// Q3. Print first 5 numbers of fibonacci series
		// fibonacci series: 0, 1 , 1, 2, 3, 5, 8....
		int a = 0, b = 0, c = 1;
		int n = 5;
		System.out.println("First 5 numbers of fibonacci series are: ");
		for(int i = 1;i<=n;i++) {
			a=b;
			b=c;
			c= a+b;
			System.out.println(a);
		}
	}
}
