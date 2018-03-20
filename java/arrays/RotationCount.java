package arrays;

/**
 * Consider an array of distinct numbers sorted in increasing order.<br>
   The array has been rotated (anti-clockwise) k number of times. 
   Given such an array, find the value of k.<br>
 * @author saikatkar
 *
 */
public class RotationCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {7,9,11,12,5};
		int n = arr.length;
		System.out.println(countRotations(arr, 0, n-1));
	}

	public static int countRotations(int arr[],int low,int high) {
		
		
		if(low>high) {
			return 0;
		}
		int mid = (high+low)/2;
		
		if(low < mid && arr[mid-1] > arr[mid]) {
			return mid;
		}
		
		if(mid < high && arr[mid] > arr[mid+1]) {
			return mid+1;
		}
		// Decide whether we need to go to left half or
	    // right half
		if(arr[high] > arr[mid]) {
			return countRotations(arr, low, mid-1);
		}else {
			return countRotations(arr, mid+1, high);
		}
		}
}
