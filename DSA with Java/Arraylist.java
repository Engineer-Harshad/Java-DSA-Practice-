package ycb;
import java.util.Scanner;
import java.util.ArrayList; 
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> in = new ArrayList<>();
		
		Scanner inn = new Scanner(System.in);
		
		//Initialization 
		for (int i=0; i<3;i++) {
			in.add(new ArrayList<>());
		}
		//Add elements 
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				in.get(i).add(inn.nextInt());
				
			}
		}
		System.out.println(in);
	}

}
