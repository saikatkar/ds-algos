package dynamic_programming;

public class MinCoinChangeTopDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int denominations[] = {1,2,3};
		int total = 7;
		Integer dp[][] = new Integer[denominations.length][total+1];
		System.out.println(minCoinChangeTopDown(dp,denominations, total,0));

	}
	
	public static int minCoinChangeTopDown(Integer [][] dp,int denominations[],int total,int index) {
		
		if(total == 0) {
			return 0;
		}
		
		if(index >= denominations.length) {
			
			return Integer.MAX_VALUE;
		}
		
		if(dp[index][total]==null) {
			
		
			int count1 = Integer.MAX_VALUE;
			if(denominations[index] <= total) {
				//choose the element at the current index
				int res = minCoinChangeTopDown(dp, denominations, total-denominations[index], index);
				if(res!=Integer.MAX_VALUE) {
					count1 = res+1;
				}
			}
			//If we do not choose the element the current index
			int count2 = minCoinChangeTopDown(dp, denominations, total, index+1);
			
			dp[index][total] = Math.min(count1, count2);
		}
		
		return dp[index][total];
		
	}

}
