package dynamic_programming;

import java.util.Arrays;

/**
 * Given a string and a pattern, write a method to count the number of times the pattern appears in the string as a subsequence.

Example 1: Input: string: “baxmx”, patten: “ax”
Output: 2
Explanation: {baxmx, baxmx}.

Example 2:

Input: string: “tomorrow”, pattern: “tor”
Output: 4
Explanation: Following are the four occurences: {tomorrow, tomorrow, tomorrow, tomorrow}.

 * @author saikatkar
 *
 */
public class SubsequencePatternMatchingBottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "tomorrow";
		String pattern = "tor";
		System.out.println(spmBottomUp(str, pattern));

	}
	
	public static int spmBottomUp(String str,String pattern) {
		
		int [][] dp = new int[str.length()+1][pattern.length()+1];
		
		for(int i=0;i<=str.length();i++) {
			dp[i][0]= 1;
		}
		
		for(int i=1;i<=str.length();i++) {
			for(int j=1;j<=pattern.length();j++) {
				if(str.charAt(i-1) == pattern.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1];
				}
				dp[i][j] += dp[i-1][j];
				
			}
		}
		System.out.println(Arrays.deepToString(dp));
		return dp[str.length()][pattern.length()];
	}

}
