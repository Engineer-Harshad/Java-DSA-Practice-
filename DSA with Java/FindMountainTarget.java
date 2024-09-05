package ycb;

public class FindMountainTarget {

	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5,3};
		// int target = 5;
		int ans = findmountain(arr);
		System.out.println(ans);
	}

	static int findmountain(int[]arr) {
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			int mid = start + (end - start)/2;
			if(arr[mid]>arr[mid+1]) {
				//Descending part of array
				end = mid;
			}
			else {
				start = mid + 1;
			}
		}
		return start;
	}
}