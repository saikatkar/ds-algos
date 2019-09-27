package dynamic_programming;

/**
 * @author saikatkar
 *
 */
public class LongestPalindromicSubstringBottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ac";
		boolean dp[][] = new boolean[str.length()][str.length()];
		System.out.println(longestPalindromic(dp, str));

	}
	
	public static int longestPalindromic(boolean dp[][],String str) {
		int startIndex =0;
		
		for(int i=0;i<str.length();i++) {
			dp[i][i] = true;
		}
		int maxLength = 1;
		for(int start=str.length()-2;start>=0;start--) {
			for(int end = start+1;end<str.length();end++) {
				
				if(str.charAt(start) == str.charAt(end)) {
					if(end-start==1 || dp[start+1][end-1]) {
						dp[start][end] = true;
						maxLength = Math.max(maxLength, end-start+1);
						startIndex = start;
					}
				}
			}
		}
		System.out.println(str.substring(startIndex, startIndex+maxLength));
		return maxLength;
	}

}
