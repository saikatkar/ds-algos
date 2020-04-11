package practice;

public class MinimumEditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "geeks";
		String s2 = "gesksab";
		
		Integer dp[][] = new Integer[s1.length()+1][s2.length()+1];
		
		System.out.println(minEditDistance(s1, s2, 0, 0, dp));

	}
	
	private static int minEditDistance(String s1,String s2,int i1,int i2,Integer [][] dp) {
		
		if(dp[i1][i2]== null) {
			
			if(i1 == s1.length()) {
				dp[i1][i2] = s2.length()-i2;
			}
			
			else if(i2 == s2.length()) {
				dp[i1][i2] = s1.length()-i1;
			}
			
			else if(s1.charAt(i1) == s2.charAt(i2)) {
				dp[i1][i2] = minEditDistance(s1, s2, i1+1, i2+1, dp);
			}else {
				int c1 = 1+minEditDistance(s1, s2, i1, i2+1, dp);
				int c2 = 1+minEditDistance(s1, s2, i1+1, i2+1, dp);
				int c3 = 1+minEditDistance(s1, s2, i1+1, i2, dp);
				dp[i1][i2] = Math.min(c1, Math.min(c2, c3));
			}
		}
		return dp[i1][i2];
	}

}
