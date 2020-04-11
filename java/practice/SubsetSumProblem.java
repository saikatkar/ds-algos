package practice;

import java.util.Arrays;

/**
 * @author saikatkar
 *
 */
public class SubsetSumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,12,10};
		System.out.println(ifSubsetExists(arr));

	}
	private static boolean ifSubsetExists(int arr[]) {
		
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		sum = sum/2;
		boolean dp[][] = new boolean[arr.length][sum+1];

		for(int i=0;i<arr.length;i++) {
			dp[i][0] = true;
		}
		
		for(int s=0;s<=sum;s++) {
			if(s == arr[0]) {
				dp[0][s] = true;
			}
		}
		
		for(int i=1;i<arr.length;i++) {
			for(int s=1;s<=sum;s++) {
				
				if(dp[i-1][s]) {
					dp[i][s] = true;
				}
				if(s>= arr[i]) {
					dp[i][s] = dp[i-1][s-arr[i]];
				}
			}
		}
		System.out.println(Arrays.deepToString(dp));
		
		return dp[arr.length-1][sum];
		
				
	}
}
