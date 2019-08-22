package dynamic_programming;

/**
 * Given a set of positive numbers, find the total number of subsets whose sum is equal to a given number ‘S’.
	Example 1:
	
	Input: {1, 1, 2, 3}, S=4
	
	Output: 3
	
	The given set has '3' subsets whose sum is '4': {1, 1, 2}, {1, 3}, {1, 3}
	
	Note that we have two similar sets {1, 3}, because we have two '1' in our input.
 *
 */
public class CountOfSubsetSumBottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountOfSubsetSumBottomUp countOfSubsetSumBottomUp = new CountOfSubsetSumBottomUp();
		int arr [] = {1,1,2,3};
		int sum = 4;
		System.out.println(countOfSubsetSumBottomUp.countSubsetSum(arr, sum));

	}
	
	public int countSubsetSum(int arr[],int sum) {
		
		int dp[][] = new int[arr.length][sum+1];
		
		for(int i=0;i<arr.length;i++) {
			
			dp[0][i] = 1; 
		}
		for(int s=1;s<=sum;s++) {
			
			if(arr[0] == s) {
				dp[0][s]=1;
			}else {
				dp[0][s]=0;
			}
		}
		for(int i=1;i<arr.length;i++) {
			for(int s=1;s<=sum;s++) {
				dp[i][s] = dp[i-1][s];
				if(s >= arr[i]) {
					dp[i][s]+= dp[i-1][s-arr[i]];
				}
			}
		}
		
		return dp[arr.length-1][sum];
		
	}

}
