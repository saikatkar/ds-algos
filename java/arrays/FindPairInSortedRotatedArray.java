package arrays;

/**
 * Given an array that is sorted and then rotated around an unknown point.<br> 
 * Find if array has a pair with given sum ‘x’.<br> 
 * It may be assumed that all elements in array are distinct.<br>
 * 	<br><br>
 *  Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16
	Output: true
	There is a pair (6, 10) with sum 16
	<br><br>
	Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 35
	Output: true
	There is a pair (26, 9) with sum 35
	<br><br>
	Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 45
	Output: false
	There is no pair with sum 45.
 * @author saikatkar
 *
 */
public class FindPairInSortedRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {11,15,6,8,9,10};
		//int d = 3;
		int n =6;
		int key = 1;
		//Find the pivot element
		
		System.out.println(pairInSortedRotated(arr, n, key));	

	}
	
	public static boolean pairInSortedRotated(int arr[], int n, int key) {
		
		int i = 0;
		for(i = 0 ; i<n;i++) {
			
			if(arr[i] > arr[i+1]) {
				break;
			}
			
		}
		int r =i;
		int l = (i+1)%n;
		
		while(l!=r) {
			
			if(arr[l]+arr[r] == key) {
				
				return true;
			}
			if(arr[l] + arr[r] < key) {
				
				l = (l+1)%n;
			}else {
				
				r = (n+r-1)%n;
			}
		}
		
		return false;
		
	}
}
