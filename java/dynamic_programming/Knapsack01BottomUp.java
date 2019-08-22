package dynamic_programming;

import java.util.Arrays;

/**
 * Bottom up approach for 0/1 knapsack problem (tabulization)
 * @author saikatkar
 *
 */
public class Knapsack01BottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] profits = {1, 6, 10, 16};
	    int[] weights = {1, 2, 3, 5};
	    
	    int maxProfit = knapsack01(weights, profits, 7);
	    
	    System.out.println(maxProfit);

	}
	
	public static int knapsack01(int weight[],int profit[],int capacity) {
		
		int dp[][] = new int[profit.length][capacity+1];
		
		for(int i =0;i<profit.length;i++) {
			
			dp[i][0] = 0;
		}
		
		for(int i =1;i<=capacity;i++) {
			if(weight[0]<=i) {
				dp[0][i] = profit[0];
			}
		}
		
		for(int i=1;i<profit.length;i++) {
			for(int c=1;c<=capacity;c++) {
				int profit1= 0, profit2 = 0;
				 profit1 = dp[i-1][c];
				
				if(weight[i]<=c) {
					profit2 = profit[i]+dp[i-1][c-weight[i]];
				}
				dp[i][c] = Math.max(profit1, profit2);
			}
		}
		
		System.out.println(Arrays.deepToString(dp));
		
		return dp[profit.length-1][capacity];
	}

}
