package dynamic_programming;

/**
 * Problem Statement

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
public class MinimumEditDistanceTopDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "passpot";
		String s2 = "ppsspqrt";
		Integer [][] dp = new Integer[s1.length()][s2.length()];
		
		System.out.println(medTopDown(s1, s2, dp,0, 0));

	}
	
	public static int medTopDown(String s1,String s2,Integer [][] dp,int i1,int i2) {
		
		if(i1 == s1.length()) {
			return s2.length()-i2;
		}
		if(i2 == s2.length()) {
			return s1.length()-i1;
		}
		if(dp[i1][i2] == null) {
			if(s1.charAt(i1) == s2.charAt(i2)) {
				dp[i1][i2]= medTopDown(s1, s2,dp, i1+1, i2+1);
			}
			else {
				int c1 = 1 + medTopDown(s1, s2,dp, i1+1, i2);
				int c2 = 1 + medTopDown(s1, s2,dp, i1, i2+1);
				int c3 = 1 + medTopDown(s1, s2,dp, i1+1, i2+1);
				dp[i1][i2] = Math.min(c3,Math.min(c1, c2));
			}
		}
		
		
		return dp[i1][i2];
	}

}
