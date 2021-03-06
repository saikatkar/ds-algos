package dynamic_programming;

/**
 * Given two strings ‘s1’ and ‘s2’, find the length of the longest subsequence which is common in both the strings.

A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.

Example 1:

Input: s1 = "abdca"

       s2 = "cbda"

Output: 3

Explanation: The longest common subsequence is "bda".

Example 2:

Input: s1 = "passport"

       s2 = "ppsspt"

Output: 5

Explanation: The longest common subsequence is "psspt".
 * @author saikatkar
 *
 */
public class LongestCommonSubsequenceBottomUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "passport";
		String s2 = "ppsspt";
		System.out.println(lcsTopDown(s1, s2));
		

	}
	
	public static int lcsTopDown(String s1,String s2) {
		
		int dp [][] = new int[s1.length()+1][s2.length()+1];
		int maxLength = 0;
		for(int i=1;i<=s1.length();i++) {
			for(int j=1;j<=s2.length();j++) {
				
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = 1+dp[i-1][j-1];
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
				maxLength = Math.max(maxLength, dp[i][j]);
			}
		}
		
		return maxLength;
	}

}
