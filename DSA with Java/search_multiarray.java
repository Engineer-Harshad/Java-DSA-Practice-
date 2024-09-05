package ycb;

public class search_multiarray {

	public static void main(String[] args) {
		int[][]arr = {
				{25,23,3},
				{4,58},
				{8,52,85}
		};
		int target = 52;
		int[] ans = search(arr,target);
		System.out.println(Arrays.toString(ans));
	}
   static int[] search(int[][]arr,int t){
	   for(int i=0;i<arr.length;i++) {
		   for(int j=0;j<arr[i].length;j++) {
			   if(arr[i][j]==t) {
				   return new int[]{i,j};    
		   }
		   }
	   }
	   return new int[]{-1,-1};
   }
}
