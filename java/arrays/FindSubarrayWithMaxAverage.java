package arrays;

/**
 * Given an array with positive and negative numbers, find the maximum average subarray of given length.

	Example:
	
	Input:  arr[] = {1, 12, -5, -6, 50, 3}, k = 4
	Output: Maximum average subarray of length 4 begins
	        at index 1.
	Maximum average is (12 - 5 - 6 + 50)/4 = 51/4
 * @author saikatkar
 *
 */
public class FindSubarrayWithMaxAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 12, -5, -6, 50, 3};
		int n = arr.length;
		int k =4;
		int currentWindowSum =0;
		int start =0, end =0;
		for(int i =0;i<k;i++) {
			currentWindowSum+=arr[i];
		}
		int maxWindowSum = Integer.MIN_VALUE;
		for(int i =0;i<n-k;i++) {
			
			if(currentWindowSum>maxWindowSum) {
				maxWindowSum = currentWindowSum;
				start = i;
				end = i+k-1;
			}
			currentWindowSum += arr[i+k];
			currentWindowSum -= arr[i];
		}

		System.out.println("["+start+","+end+"]");
	}


}
