package dynamic_programming;

/**
 * @author saikatkar
 *
 */
public class Knapsack01TopDown {
	
	public static void main(String args[]) {
		int[] profits = {1, 6, 10, 16};
	    int[] weights = {1, 2, 3, 5};
	    int capacity = 7;
		Integer [][] dp = new Integer[profits.length][capacity+1];
		
		Knapsack01TopDown knapsack01TopDown = new Knapsack01TopDown();
		
		int maxProfit = knapsack01TopDown.knapSack01(profits, weights, capacity, 0, dp);
		
		System.out.println(maxProfit);
		
	}
	
	public int knapSack01(int profit[],int weight[],int capacity,int index,Integer dp[][]) {
		
		if(capacity <= 0 || index >= profit.length){
			return 0;
		}
		
		if(dp[index][capacity] != null) {
			return dp[index][capacity];
		}
		int profit1 = 0,profit2;
		if(weight[index] <= capacity) {
			
			profit1 = profit[index]+knapSack01(profit, weight, capacity-weight[index], index+1,dp);
		}
		profit2 = knapSack01(profit, weight, capacity, index+1, dp);
		
		dp[index][capacity] = Math.max(profit1, profit2);
		
		return dp[index][capacity];
	}

}
