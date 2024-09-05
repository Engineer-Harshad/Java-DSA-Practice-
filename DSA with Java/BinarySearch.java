package ycb;
public class BinarySearch {

	public static void main(String[] args) {
        int[]arr = {-4,-1,1,4,4,5,6,7,9};
        int target = 1;
        int ans = bisearch(arr,target);
        System.out.println(ans);
	}
	// return index
	// return -1
    static int bisearch(int[]arr,int target) {
    	int start = 0;
    	int end = arr.length-1;
		while(start<= end) {
			int mid = start + (end-start)/2;
            if(target<arr[mid]) {
				end = mid - 1;
			}
            else if(target>arr[mid]) {
            	start = mid + 1;
            }
            else {
            	return mid;
            }
		}
		return -1;
	}
}
