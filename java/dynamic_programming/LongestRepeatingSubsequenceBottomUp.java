package dynamic_programming;

/**
 * Given a sequence, find the length of its longest repeating subsequence (LRS).
 * A repeating subsequence will be the one that appears at least twice in the original sequence and
 * is not overlapping (i.e. none of the corresponding characters in the repeating subsequences have the same index).

Example 1:

Input: “t o m o r r o w”
Output: 2
Explanation: The longest repeating subsequence is “or” {tomorrow}.

Example 2:

Input: “a a b d b c e c”
Output: 3
Explanation: The longest repeating subsequence is “a b c” {a a b d b c e c}.

Example 3:

Input: “f m f f”
Output: 2
Explanation: The longest repeating subsequence is “f f” {f m f f, f m f f}. Please note the second last character is shared in LRS.

 * @author saikatkar
 *
 */
public class LongestRepeatingSubsequenceBottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "tomorrow";
		String str = "aabdbcec";
		System.out.println(lrsBottomUp(str));

	}
	
	public static int lrsBottomUp(String str) {
		
		int dp [][] = new int[str.length()+1][str.length()+1];
		
		for(int i =1 ;i <= str.length();i++) {
			for(int j=1;j<=str.length();j++) {
				
				if(i!=j && str.charAt(i-1) == str.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1]+1;
				}else {
					
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[str.length()][str.length()];
	}

}
