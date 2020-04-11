package practice;

public class MinimumOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int [] dp = new int[n+1];
		int minOps = minOperations(n, dp);
		System.out.println(minOps);

	}
	
	private static int minOperations(int n,int dp []) {
		
		if(n<=1) {
			return 1;
		}
		
		if(dp[n]!=0) {
			return dp[n];
		}else {
			if(n%2 == 0) {
				dp[n] = 1 + minOperations(n/2, dp);
			}else {
				dp[n] = 1 + minOperations(n-1, dp);
			}
		}
		return dp[n];
	}

}
