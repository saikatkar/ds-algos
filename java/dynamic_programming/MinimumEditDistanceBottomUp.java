package dynamic_programming;

/**
 *  Problem Statement

Given strings s1 and s2, we need to transform s1 into s2 by deleting, inserting, or replacing characters. Write a function to calculate the count of the minimum number of edit operations.

Example 1:

Input: s1 = "bat"

       s2 = "but"

Output: 1

Explanation: We just need to replace 'a' with 'u' to transform s1 to s2.

Example 2:

Input: s1 = "abdca"

       s2 = "cbda"

Output: 2

Explanation: We can replace first 'a' with 'c' and delete second 'c'.

Example 3:

Input: s1 = "passpot"

       s2 = "ppsspqrt"

Output: 3 

Explanation: Replace 'a' with 'p', 'o' with 'q', and insert 'r'.
 * @author saikatkar
 *
 */
public class MinimumEditDistanceBottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abdca";
		String s2 = "cbda";
		System.out.println(medBottomUp(s1, s2));
	}
	
	public static int medBottomUp(String s1,String s2) {
		
		int [][] dp = new int[s1.length()+1][s2.length()+1];
		
		for(int i=0;i<=s1.length();i++) {
			
			dp[i][0] = i;
		}
		for(int j=0;j<=s2.length();j++) {
			
			dp[0][j] = j;
		}
		
		for(int i=1;i<=s1.length();i++) {
			for(int j=1;j<=s2.length();j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1];
				}else {
					
					dp[i][j] = 1+Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
				}
			}
		}
		return dp[s1.length()][s2.length()];
	}

}
