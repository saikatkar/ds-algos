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
public class LongestRepeatingSubsequenceTopDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "tomorrow";
		String str = "aabdbcec";
		Integer [][]dp = new Integer[str.length()][str.length()];
		System.out.println(lrsTopDown(str, dp, 0, 0));

	}
	
	public static int lrsTopDown(String str,Integer [][] dp,int i1,int i2) {
		
		if(i1 == str.length() || i2 == str.length()) {
			return 0;
		}
		
		if(dp[i1][i2] == null) {
			
			if(i1 != i2 && str.charAt(i1) == str.charAt(i2)) {
				dp[i1][i2] =  1+lrsTopDown(str, dp, i1+1, i2+1);
			}else {
				int c1 = lrsTopDown(str, dp, i1+1, i2);
				int c2 = lrsTopDown(str, dp, i1, i2+1);
				dp[i1][i2] = Math.max(c1, c2);
			}
		}
			return dp[i1][i2];
	}

}
