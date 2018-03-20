package arrays;

/**
 * Maximum difference between two elements such that larger element appears after the smaller number
	<br>
	Given an array arr[] of integers, find out the difference between any two elements such that larger element appears after the smaller number in arr[].
	<br>
	Examples: If array is [2, 3, 10, 6, 4, 8, 1] then returned value should be 8 (Diff between 10 and 2). If array is [ 7, 9, 5, 6, 3, 2 ] then returned value should be 2 (Diff between 7 and 9)
 * @author saikatkar
 *
 */
public class MaxDiffBetweenTwoElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 90, 10, 110};
		int n = arr.length;
		int minNumber = arr[0];
		int maxDiff = arr[1] - arr[0];
		for(int i =1 ;i<n;i++) {

			if(arr[i]-minNumber > maxDiff) {
				
				maxDiff = arr[i] - minNumber;
			}
			
			if(arr[i]<minNumber) {
				minNumber = arr[i];
			}
		}
		
		
		System.out.println(maxDiff);
	}

}
