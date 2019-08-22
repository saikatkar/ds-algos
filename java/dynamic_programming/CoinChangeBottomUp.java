package dynamic_programming;

import java.util.Arrays;

/**
 * Given an infinite supply of ‘n’ coin denominations and a total money amount, we are asked to find the total number of distinct ways to make up that amount.

Example:

Denominations: {1,2,3}

Total amount: 5

Output: 5

Explanation: There are five ways to make the change for '5', here are those ways:

  1. {1,1,1,1,1} 

  2. {1,1,1,2} 

  3. {1,2,2}

  4. {1,1,3}

  5. {2,3}
 * @author saikatkar
 *
 */
public class CoinChangeBottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] denominations = {1,2,3};
		int totalAmount = 5;
		
		System.out.println(changeCoinBottomUp(denominations,totalAmount));

	}

	
	public static int changeCoinBottomUp(int [] denominations,int total) {
		
		int dp[][] = new int[denominations.length][total+1];
		
		for(int i=0; i < denominations.length; i++)
		      dp[i][0] = 1;
		
		for(int i=0;i<denominations.length;i++) {
			int p1=0,p2=0;
			for(int t=1;t<=total;t++) {
				
				if(i>0) {
					p1 = dp[i-1][t];
				}
				if(denominations[i] <= t) {
					p2 = dp[i][t-denominations[i]];
				}
				
				dp[i][t] = p1+p2;
			}
		}
		System.out.println(Arrays.deepToString(dp));
		return dp[denominations.length-1][total];
		
	}
}
