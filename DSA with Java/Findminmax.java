package ycb;

public class Findminmax {

	public static void main(String[] args) {
		int[]arr = {12,13,3,20,14,15};
		System.out.println(minimum(arr));
		System.out.println(maximum(arr));
	}
    static int minimum(int[]arr) {
    	int min = arr[3];
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]<min) {
    			min = arr[i];
    	}	
    	} 
    	return min; 
    }
 
    static int maximum(int[]arr) {
    	int max = arr[5];
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]>max) {
    			max = arr[i];
    	}	
    	}
    		return max;
    	} 
			
    }

