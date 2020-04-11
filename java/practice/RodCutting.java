package practice;

public class RodCutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] lengths = {1, 2, 3, 4, 5};
		int	[] prices = {2, 6, 7, 10, 13};
		System.out.println(getMaxValue(lengths, prices));
	}
	
	private static int getMaxValue(int lengths[],int prices[]) {
		
		int n = prices.length;
		int dp[][] = new int[lengths.length][n+1];
		
		//int maxProfit =0;
		
		for(int l=0;l<lengths.length;l++) {
			for(int i=1;i<=n;i++) {
				
				if(lengths[l]<= i) {
					dp[l][i] = prices[l] + dp[l][i-lengths[l]];
				}
				if(l>0) {
					dp[l][i] = Math.max(dp[l][i], dp[l-1][i]);

				}
				
			}
		}
		
		return dp[lengths.length-1][n];
	}

}
