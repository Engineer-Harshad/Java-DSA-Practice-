package Practice;
import java.util.Arrays;
public class cyclicsort2 {

	public static void main(String[] args) {
		int[] arr = {4,0,1,2};
		missingnumber(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(missingnumber(arr));
	}
	static int missingnumber(int[]arr) {
		   int i = 0;
		   while(i<arr.length) {
			   if(arr[i]<arr.length && i!= arr[i]) {
				   swap(arr,i,arr[i]);
			   }
			   else {
				   i++;
			   }
		   }
		   for(int index = 0; index<arr.length;index++) {
			   if(arr[index] != index) {
				   return index;
			   }
		   } 
		   //case 2
		   return arr.length;
	   }
	   static void swap(int[]arr, int first, int second) {
		   int temp = arr[first];
		   arr[first] = arr[second];
				   arr[second]=temp;
	   }
}

