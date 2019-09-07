package dynamic_programming;

/**
 * Given a number sequence, find the increasing subsequence with the highest sum. Write a method that returns the highest sum.

Example 1:

Input: {4,1,2,6,10,1,12}

Output: 32

Explanation: The increaseing sequence is {4,6,10,12}. 

Please note the difference, as the LIS is {1,2,6,10,12} which has a sum of '31'.

Example 2:

Input: {-4,10,3,7,15}

Output: 25

Explanation: The increaseing sequences are {10, 15} and {3,7,15}.
 * @author saikatkar
 *
 */
public class MaxSumIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [] = {4,1,2,6,10,1,12};
		System.out.println(maxSumIncreasingSubsequence(arr));
	}
	
	public static int maxSumIncreasingSubsequence(int arr[]) {
		
		int dp[] = new int[arr.length];
		
		dp[0] = arr[0];
		int maxSum = arr[0];
		for(int i=1;i<arr.length;i++) {
			dp[i] = arr[i];
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j] && dp[i]<=dp[j]+arr[i]) {
					
					dp[i] = dp[j]+ arr[i];
					maxSum = Math.max(dp[i], maxSum);
				}
			}
		}
		return maxSum;
	}

}
