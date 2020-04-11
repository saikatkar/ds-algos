package practice;

public class DifferentWaysToCoverStaircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		
		System.out.println(differentWays(n));

	}
	
	private static int differentWays(int n) {
		
		int dp[] = new int[n+1];
		
		dp[0] =1;
		dp[1] =1;
		dp[2] =2;
		for(int i =3;i<=n;i++) {
			dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
		}
		
		return dp[n];
	}

}
