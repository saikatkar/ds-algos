package dynamic_programming;

/**
 * Given a number sequence, find the length of its Longest Increasing Subsequence (LIS). In an increasing subsequence, all the elements are in increasing order (from lowest to highest).

Example 1:

Input: {4,2,3,6,10,1,12}

Output: 5

Explanation: The LIS is {2,3,6,10,12}.

Example 1:

Input: {-4,10,3,7,15}

Output: 4

Explanation: The LIS is {-4,3,7,15}.
 * @author saikatkar
 *
 */
public class LongestIncreaingSubsequenceTopDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {4,2,3,6,10,1,12};
		Integer [][] dp = new Integer[arr.length+1][arr.length];
		System.out.println(lisTopDown(dp, arr, 0, -1));

	}
	
	public static int lisTopDown(Integer [][]dp,int [] arr,int current,int previous) {
		
		if(current == arr.length) {
			return 0;
		}
		
		if(dp[previous+1][current] == null) {
			
			int c1 =0;
			int c2 =0;
			if(previous == -1 || arr[current] > arr[previous]) {
				 c1 = 1+lisTopDown(dp, arr, current+1, current);
			}
				
			c2 = lisTopDown(dp, arr, current+1, previous);
			
			dp[previous+1][current] =  Math.max(c1, c2);
		}
		return dp[previous+1][current];
	}

}
