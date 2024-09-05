package ycb;
import java.util.Scanner;
public class VarArgs {
	
	// factorial(0) = 1
	// Factorial(n) = n*n-1*....1
	// factorial(5) = 5*4*3*2*1 = 120
	// factorial(n) = n * factorial(n-1)
	
	// recursive approach
	static int factorial(int n) {
		if (n == 0 || n ==1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
		}
	// factorial by iterative approach 
	static int factorial_ite(int n) {
		if (n == 0 || n ==1) {
			return 1;
		}
		else { 
			int res = 1;
			for(int i = 1;i<=n;i++) {
				res *= i;
			}
			return res;
		}
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
 		System.out.println("factorial " + factorial(x));
 		System.out.println("factorial " + factorial_ite(x));
		}
}
