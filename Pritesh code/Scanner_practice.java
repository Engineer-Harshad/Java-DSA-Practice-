package Mycode;

public class Scanner_practice {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println();
			for(int k=1;k<=4;k++) {
				for(int l=i;l>=1;l--) {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
		
	}
}
