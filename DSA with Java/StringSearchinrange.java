package ycb;

public class StringSearchinrange {

	public static void main(String[] args) {
		String name = "Harshad";
	     char target = 'r';
	     System.out.println(search(name,target,1,5));
	  	}
	static boolean search(String str,char tar,int start,int end) {
    	if(str.length()==0) {
			return false;
    	}
    	for (int i=start;i<end;i++) {
    		if(str.charAt(i)==tar) {
    			return true;
    		}
    		}
    		return false;
    	}
}
