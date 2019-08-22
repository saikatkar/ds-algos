package dynamic_programming;

public class HouseThiefBottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wealth [] ={2, 10, 14, 8, 1};
		System.out.println(houseThiefBottomUp(wealth));

	}
	
	public static int houseThiefBottomUp(int[] wealth) {
		
		int dp [] = new int[wealth.length+1];
		dp[0] = 0;
		dp[1] = wealth[0];
		
		for(int i=1;i<wealth.length;i++) {
			
			dp[i+1] = Math.max(wealth[i]+dp[i-1],dp[i]);
		}
		
		return dp[wealth.length];
	}

}
