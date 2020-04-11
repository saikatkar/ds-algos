package practice;

public class CoinChangeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int arr[] = {1,2,3};
		
		System.out.println(possibleWays(arr, n));

	}
	
	private static int possibleWays(int arr[],int n) {
		
		int dp[][] = new int[arr.length][n+1];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[0] <= n) {
				dp[i][0] = 1;
			}
		}
		//int count=0;
		
			for(int i=0;i<arr.length;i++) {
				for(int j=1;j<=n;j++) {
				
				if(i>0) {
					dp[i][j] = dp[i-1][j];
				}
				if(arr[i]<=j) {
					dp[i][j] += dp[i][j-arr[i]];
				}
			}
		}
		
		return dp[arr.length-1][n];
		
		
	}

}
