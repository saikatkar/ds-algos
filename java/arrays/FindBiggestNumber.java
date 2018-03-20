package arrays;

/**
 * Find the maximum element in an array which is first increasing and then decreasing

Given an array of integers which is initially increasing and then decreasing, find the maximum value in the array.

Input: arr[] = {8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1}
Output: 500

Input: arr[] = {1, 3, 50, 10, 9, 7, 6}
Output: 50

Corner case (No decreasing part)
Input: arr[] = {10, 20, 30, 40, 50}
Output: 50

Corner case (No increasing part)
Input: arr[] = {120, 100, 80, 20, 0}
Output: 120
 * @author saikatkar
 *
 */
public class FindBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1, 3, 5, 7,9,11};
		int n = arr.length;
		System.out.println(arr[findBiggestNumber(arr, 0, n-1)]);

	}

	
	public static int findBiggestNumber(int arr[],int low,int high) {
		
		if(low==high) {
			return low;
		}
		if ((high == low + 1) && arr[low] >= arr[high])
	          return low;
	     
	       /* If there are two elements and 
	          second is greater then the second 
	          element is maximum */
	       if ((high == low + 1) && arr[low] < arr[high])
	          return high;
		
		int mid = (high+low)>>>1;
		
		if(arr[mid]>arr[mid+1] && arr[mid-1]<arr[mid]) {
			
			return mid;
		}
		else if(arr[mid]>arr[mid+1] && arr[mid-1]>arr[mid]) {
			
			return findBiggestNumber(arr, low, mid-1);
		}else {
			
			return findBiggestNumber(arr, mid+1, high);
		}
		
	}
}
