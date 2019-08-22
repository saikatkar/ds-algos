package dynamic_programming;

/**
 * 
 * Given a sequence, find the length of its Longest Palindromic Subsequence (LPS). In a palindromic subsequence, elements read the same backward and forward.

A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.

Example 1:

Input: "abdbca"

Output: 5

Explanation: LPS is "abdba".

Example 2:

Input: = "cddpd"

Output: 3

Explanation: LPS is "ddd".
 * @author saikatkar
 *
 */
public class LPSTopDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cddpd";
		Integer [][] dp = new Integer[s.length()][s.length()];
		System.out.println(lpsTopDown(dp, 0, s.length()-1, s));

	}
	
	public static int lpsTopDown(Integer dp[][],int start,int end,String s) {
		
		if(start > end) {
			
			return 0;
		}
		if(start == end) {
			return 1;
		}
		
		if(dp[start][end] == null) {
			
			if(s.charAt(start) == s.charAt(end)) {
				dp[start][end] =  2+lpsTopDown(dp, start+1, end-1, s);
			}else {
				
				int c1 = lpsTopDown(dp, start+1, end, s);
				int c2 = lpsTopDown(dp, start, end-1, s);
				dp[start][end] = Math.max(c1,c2);
			}
		}
		return dp[start][end];
		
	}

}
