package practice;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(lps("cdeepd"));

	}
	
	private static int lps(String str) {
		
		boolean dp [][] = new boolean[str.length()][str.length()];
		
		for(int i=0;i<str.length();i++) {
			dp[i][i] = true ;
		}
		int maxLength=1;
		
		for(int s = str.length()-2;s>=0;s--) {
			for(int e=s+1;e<str.length();e++) {
				if(str.charAt(s)== str.charAt(e)) {
					
					if(e -s == 1 || dp[s+1][e-1]) {
						dp[s][e] = true;
						if(e-s+1 > maxLength) {
							maxLength = e-s+1;
						}
					}
				}
			}
		}
		
		return maxLength;
		
	}

}
