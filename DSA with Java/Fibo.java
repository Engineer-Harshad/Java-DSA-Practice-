package ycb;
public class Fibo{
	public static void main(String[] args) {
		        int n=5, a = 0, b = 0, c = 1;
		        for(int i = 1; i <= n; i++)
		        {
		            a = b;
		            b = c;
		            c = a + b;
		            System.out.print(a+" ");
		        }
		    	
		    	//alternative: 
		    	    // Formula - fib(n-1)+fib(n-2)

		    	   /* static int fib(int n){
		    	        if (n==0)
		    	            return 0;
		    	        else if (n==1)
		    	            return 1;
		    	        else
		    	            return fib(n-1)+fib(n-2);   
		    	    }

		    	        public static void main(String[] args) {
		    	       for (int i = 0;i<=5;i++){
		    	            System.out.println(fib(i));
		    	        }*/
		    }
		}