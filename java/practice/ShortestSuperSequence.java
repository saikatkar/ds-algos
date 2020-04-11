package practice;

import java.util.Arrays;

public class ShortestSuperSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcf";
		String s2 = "bdcf";
		
		System.out.println(sss(s1, s2));

	}
	
	private static int sss(String s1,String s2) {
		
		int dp[][] = new int[s1.length()+1][s2.length()+1];
		
		for(int i=1;i<s1.length();i++) {
			dp[i][0] = i;
			dp[0][i] = i;
		}
		
		for(int i=1;i<=s1.length();i++) {
			for(int j=1;j<=s2.length();j++) {
				
				if(s1.charAt(i-1)== s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j];
				}else {
					dp[i][j] = Math.min(dp[i-1][j],1+dp[i][j-1]);
				}
			}
		}
		System.out.println(Arrays.deepToString(dp));
		return dp[s1.length()][s2.length()];
	}

}
