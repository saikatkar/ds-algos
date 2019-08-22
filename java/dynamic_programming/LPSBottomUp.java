package dynamic_programming;

public class LPSBottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(lpsBottomUp("abdbca"));
	}
	
	public static int lpsBottomUp(String s) {
		
		int [][] dp = new int[s.length()][s.length()];
		
		for(int start=0;start<s.length();start++) {
			for(int end=0;end<s.length();end++) {
				
				if(start==end) {
					dp[start][end] = 1;
				}
			}
		}
		for(int start = s.length()-2;start>=0;start--) {
			for(int end = start+1;end<s.length();end++) {
				if(s.charAt(start) == s.charAt(end)) {
					dp[start][end] = 2+dp[start+1][end-1];
				}else {
					dp[start][end] = Math.max(dp[start+1][end],dp[start][end-1]);
				}
			}
		}
		
		return dp[0][s.length()-1];
	}

}
