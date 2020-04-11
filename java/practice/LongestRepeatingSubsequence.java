package practice;

public class LongestRepeatingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "tomorrow";
		System.out.println(lrs(str));
	}
	
	private static int lrs(String str) {
		
		int dp[][] = new int[str.length()+1][str.length()+1];
		int maxLength =0;
		for(int i=1;i<=str.length();i++) {
			for(int j=1;j<=str.length();j++) {
				
				if(str.charAt(i-1) == str.charAt(j-1) && i!=j) {
					dp[i][j] = dp[i-1][j-1]+1;
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
				maxLength = Math.max(maxLength, dp[i][j]);
			}
		}
		return maxLength;
	}

}
