package practice;

public class LongestCommonSubsequence {
	
	public static void main(String[] args) {
		
		String s1 = "abcdef";
		String s2 = "ace";
		
		System.out.println(lcss(s1,s2));
	}
	
	private static int lcss(String s1,String s2) {
		
		int dp[][] = new int[s1.length()+1][s2.length()+1];
		
		int maxLength = 0;
		
		for(int i =1; i<=s1.length();i++) {
			for(int j=1;j<=s2.length();j++) {
				
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = 1+dp[i-1][j-1];
				}else {
					dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
				}
				
				maxLength = Math.max(maxLength, dp[i][j]);
			}
		}
		
		return maxLength;
		
	}

}
