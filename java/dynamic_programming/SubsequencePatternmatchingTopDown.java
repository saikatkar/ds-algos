package dynamic_programming;

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
public class SubsequencePatternmatchingTopDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "tomorrow";
		String pattern = "tor";
		Integer [][]dp = new Integer[str.length()][pattern.length()];
		
		System.out.println(spmTopDown(str,dp, pattern, 0, 0));

	}
	
	public static int spmTopDown(String str,Integer [][]dp,String pattern,int i1,int i2) {
		
		if(i1 == str.length()) {
			return 0;
		}
		if(i2 == pattern.length()) {
			return 1;
		}
		if(dp[i1][i2] == null) {
			
			int c1 =0;
			if(str.charAt(i1) == pattern.charAt(i2)) {
				
				c1 = spmTopDown(str, dp,pattern, i1+1, i2+1);
			}
			int c2 = spmTopDown(str, dp,pattern, i1+1, i2);
			
			dp[i1][i2] = c1+c2;
		}
		return dp[i1][i2];
		
	}

}
