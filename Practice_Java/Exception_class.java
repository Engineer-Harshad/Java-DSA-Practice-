package harshad;

import java.util.Scanner;

class Simple extends Exception{
	public String toString() {
		return"I am tostring";
	}
	public String getMessage() {
		return "I am getmessage";
	}
}

public class Exception_class {

	public static void main(String[] args) {
		int a;
		Scanner input = new Scanner(System.in);
	    a = input.nextInt();
	    if(a<9) {
	    	try {
	    		throw new Simple();
	    	}
	    	catch(Exception e){
	    		System.out.println(e.getMessage());
	    		System.out.println(e.toString());
	    		System.out.println(e);
	    		e.printStackTrace();
	    	}
	    }
	}

}
