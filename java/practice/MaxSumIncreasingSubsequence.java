package practice;

import java.util.Arrays;

public class MaxSumIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,1,2,6,10,1,12};
		int arr1[] = {-4,10,3,7,15};
		
		System.out.println(findMaxSum(arr));

	}
	
	private static int findMaxSum(int arr[]) {
		
		int dp[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			dp[i] = arr[i];
		}
		int maxSum = arr[0];
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<i && arr[i]>arr[j];j++) {
				
				if (dp[i] < dp[j]+arr[i]) {
					dp[i] = dp[j]+arr[i];
				}
				
				maxSum = Math.max(maxSum, dp[i]);
			}
		}
		System.out.println(Arrays.toString(dp));
		return maxSum;
	}

}
