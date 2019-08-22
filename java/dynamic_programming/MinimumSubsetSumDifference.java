package dynamic_programming;

/**
 * @author saikatkar
 *Given a set of positive numbers, partition the set into two subsets with a minimum difference between their subset sums.
Example 1:

Input: {1, 2, 3, 9}

Output: 3

Explanation: We can partition the given set into two subsets where minimum absolute difference 

between the sum of numbers is '3'. Following are the two subsets: {1, 2, 3} & {9}.
 */
public class MinimumSubsetSumDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {1, 2, 3, 9};
		MinimumSubsetSumDifference minimumSubsetSumDifference = new MinimumSubsetSumDifference();
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum += num[i];
		}
		Integer[][] dp = new Integer[num.length][sum+1];
		System.out.println(minimumSubsetSumDifference.minDiff(num, dp, 0, 0, 0));

	}
	
	public int minDiff(int [] num,Integer [][] dp,int sum1,int sum2,int index) {
		
		if(index == num.length) {
			return Math.abs(sum1-sum2);
		}
		
		if(dp[index][sum1] ==null) {
			
			int diff1 = minDiff(num, dp, sum1+num[index], sum2, index+1);
			int diff2 = minDiff(num, dp, sum1, sum2+num[index], index+1);
			
			dp[index][sum1] = Math.min(diff1, diff2);
		}
		return dp[index][sum1];
	}
	
	

}
