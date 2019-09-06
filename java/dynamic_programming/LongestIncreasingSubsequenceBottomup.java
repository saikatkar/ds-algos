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
public class LongestIncreasingSubsequenceBottomup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-4,10,3,7,15};
		int arr1[] = {4,2,3,6,10,1,12};
		System.out.println(lisTopDown(arr));

	}
	
	public static int lisTopDown(int arr[]) {
		
		int dp [] = new int[arr.length];
		
		for(int i=0;i<dp.length;i++) {
			dp[i] = 1;
		}
		int maxLength = 1;
		for(int i=1;i<dp.length;i++) {
			
			for(int j=0;j<i;j++) {
				
				if(arr[i] > arr[j] && dp[i] <= dp[j]) {
					
					dp[i]=dp[j]+1;
					maxLength = Math.max(maxLength, dp[i]);
				}
			}
		}
		return maxLength;
	}
	
	

}
