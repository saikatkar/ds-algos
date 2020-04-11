package practice;

import java.util.Arrays;

public class SubsequencePatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "tomorrow";
		String pat = "tor";
		
		System.out.println(spm(str, pat));
	}
	
	private static int spm(String str,String pat) {
		
		int dp [][] = new int[str.length()+1][pat.length()+1];
		
		for(int i=0;i<=str.length();i++) {
			
			dp[i][0] = 1;
		}
		
		for(int i=1;i<=str.length();i++) {
			for(int j=1;j<=pat.length();j++) {
				
				if(str.charAt(i-1) == pat.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1];
				}
				dp[i][j] += dp[i-1][j];
			}
		}
		
		System.out.println(Arrays.deepToString(dp));
		return dp[str.length()][pat.length()];
	}

}
