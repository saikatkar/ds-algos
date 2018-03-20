package arrays;

/**
 * Find the subarray with least average

	Given an array arr[] of size n and integer k such that k <= n.
	
	Input:  arr[] = {3, 7, 90, 20, 10, 50, 40}, k = 3
	Output: Subarray between indexes 3 and 5
	The subarray {20, 10, 50} has the least average 
	among all subarrays of size 3.
	
	Input:  arr[] = {3, 7, 5, 20, -10, 0, 12}, k = 2
	Output: Subarray between [4, 5] has minimum average
 * @author saikatkar
 *
 */
public class FindSubArrayWithLeastAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 7, 90, 20, 10, 50, 40};
		int n = arr.length;
		int k =3;
		int currentWindowSum =0;
		int start =0, end =0;
		for(int i =0;i<k;i++) {
			currentWindowSum+=arr[i];
		}
		int minWindowSum = Integer.MAX_VALUE;
		for(int i =0;i<n-k;i++) {
			
			if(currentWindowSum<minWindowSum) {
				minWindowSum = currentWindowSum;
				start = i;
				end = i+k-1;
			}
			currentWindowSum += arr[i+k];
			currentWindowSum -= arr[i];
		}

		System.out.println("["+start+","+end+"]");
	}

}
