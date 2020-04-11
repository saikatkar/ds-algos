package practice;

import java.util.Arrays;

public class ZeroOneKnapsackProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] profit = {1,2,3};
		int [] weight = {4,5,1};
		int capacity = 4;
		int maxProfit = findMaxProfit(weight, profit, capacity);
		System.out.println(maxProfit);

	}
	
	private static int findMaxProfit(int weight[],int profit[],int capacity) {
		
		int [][] dp = new int[profit.length][capacity+1];
		
		for(int c =1;c<=capacity;c++) {
			if(weight[0]<=c)
			 dp[0][c] = profit[0];
		}
		
		for(int i=1;i<profit.length;i++) {
			for(int c=1;c<=capacity;c++) {
				int profit1 = 0,profit2=0;
				
				if(weight[i]<=c) {
					profit1 = profit[i] + dp[i-1][c-weight[i]];
				}
				profit2 = dp[i-1][c];
				
				dp[i][c] = Math.max(profit1, profit2);
			}
		}
		System.out.println(Arrays.deepToString(dp));
		return dp[profit.length-1][capacity];
	}

}
