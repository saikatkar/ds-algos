package dynamic_programming;

/**
 * 
 * Given an infinite supply of ‘n’ coin denominations and a total money amount, 
 * we are asked to find the minimum number of coins needed to make up that amount.

	Example 1:
	
	Denominations: {1,2,3}
	
	Total amount: 5
	
	Output: 2
	
	Explanation: We need minimum of two coins {2,3} to make a total of '5'
 * @author saikatkar
 *
 */
public class MinCoinChangeBottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int denominations[] = {1,2,3};
		int total = 7;
		System.out.println(minCoinChange(denominations, total));
		

	}
	
	public static int minCoinChange(int[] denominations,int total) {
		
		int dp[][] = new int[denominations.length][total+1];
		
		for(int i=0;i<denominations.length;i++) {
			for(int t=1;t<=total;t++) {
				int p1=Integer.MAX_VALUE,p2=Integer.MAX_VALUE;
				if(i>0) {
					p1 = dp[i-1][t];
				}
				if(t>= denominations[i]) {
					p2 = dp[i][t-denominations[i]]+1;
				}
				dp[i][t] = Math.min(p1, p2);
			}
		}
		
		return dp[denominations.length-1][total];
		
		
	}

}
