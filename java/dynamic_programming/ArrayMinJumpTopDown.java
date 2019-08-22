package dynamic_programming;

public class ArrayMinJumpTopDown {

	public static void main(String[] args) {
		
		int jump [] =  {2,1,1,1,4};
		int dp[] = new int[jump.length];
		// TODO Auto-generated method stub
		System.out.println(minJumpTopDown(jump, 0, dp));

	}
	
	public static int minJumpTopDown(int [] jump,int index,int dp[]) {
		
		if(index == jump.length-1) {
			return 0;
		}
		
		if(jump[index] ==0) {
			return Integer.MAX_VALUE;
		}
		
		if(dp[index]!=0) {
			return dp[index];
		}
		
		int totalJumps = Integer.MAX_VALUE;
		int start = index+1;
		int end = index+jump[index];
		
		while(start < jump.length && start<=end) {
			
			int minJumps = minJumpTopDown(jump, start++, dp);
			if(minJumps!=Integer.MAX_VALUE) {
				totalJumps = Math.min(minJumps+1, totalJumps);
			}
			dp[index] = totalJumps;
		}
		
		return dp[index];
	}

}
