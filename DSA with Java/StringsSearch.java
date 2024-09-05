package ycb;

public class StringsSearch {

	public static void main(String[] args) {
     String name = "Harshad";
     char target = 'r';
     System.out.println(search(name,target));
     System.out.println(search2(name,target));
     // System.out.println(Arrays.toString(name.toCharArray()));
	}
	 static boolean search2(String str,char tar) {
	    	if(str.length()==0) {
				return false;
	    	}
	    	for (char ch:str.toCharArray()){
	    		if(ch==tar) {
	    			return true;
	    		}
	    		}
	    		return false;
	 }
	 
    static boolean search(String str,char tar) {
    	if(str.length()==0) {
			return false;
    	}
    	for (int i=0;i<str.length();i++) {
    		if(str.charAt(i)==tar) {
    			return true;
    		}
    		}
    		return false;
    	}
    }
