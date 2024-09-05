package ycb;

public class Arrays {

	public static void main(String[] args) {
		int [] rollno = new int[5];
		
		int [] rolln2 = {23,42,15,35}; // internally it is doing same thing as new 
		
		int [] roll; // declaration of array, roll is defined in stack, not pointing to any object: at compile time
		roll = new int[5]; //Initialization: actual memory creation, object is being created in  heap memory : at run time
		// dynamic memory allocation: memory allocated at run time 
		System.out.println(rolln2[2]);
		// new is used to create an object 
		String[]arr = new String[5];
		System.out.println(arr[0]);
	}

}
