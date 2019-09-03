package dynamic_programming;

/**
 * Given a string, find the length of its Longest Palindromic Substring (LPS). In a palindromic string, elements read the same backward and forward.

Example 1:

Input: "abdbca"

Output: 3

Explanation: LPS is "bdb".

Example 2:

Input: = "cddpd"

Output: 3

Explanation: LPS is "dpd".

Example 3:

Input: = "pqr"

Output: 1

Explanation: LPS could be "p", "q" or "r".
 * @author saikatkar
 *
 */
public class LongestPalindromicSubstringTopDown {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abdbca";
		Integer [][] dp = new Integer[str.length()][str.length()];
		System.out.println(lpsTopDown(dp, 0, str.length()-1, str));

	}
	
	public static int lpsTopDown(Integer [][] dp,int start,int end,String str) {
		
		if(start > end) {
			
			return 0;
		}
		if(start == end) {
			return 1;
		}
		
		if(dp[start][end] == null) {
			
			if(str.charAt(start) == str.charAt(end)) {
				
				int remainingLength = end-start-1;
				
				if(remainingLength == lpsTopDown(dp, start+1, end-1, str)) {
					
					dp[start][end] = remainingLength+2;
					return dp[start][end];
				}
				
			}
			int c1 = lpsTopDown(dp, start+1, end, str);
			int c2 = lpsTopDown(dp, start, end-1, str);
			
			dp[start][end] = Math.max(c1, c2); 
		}
		
		return dp[start][end];
	}

}
