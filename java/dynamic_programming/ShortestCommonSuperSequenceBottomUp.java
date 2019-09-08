package dynamic_programming;

import java.util.Arrays;

/**
 * Given two sequences ‘s1’ and ‘s2’, write a method to find the length of the shortest sequence which has ‘s1’ and ‘s2’ as subsequences.

Example 2:

Input: s1: "abcf" s2:"bdcf" 

Output: 5

Explanation: The shortest common super-sequence (SCS) is "abdcf". 

Example 2:

Input: s1: "dynamic" s2:"programming" 

Output: 15

Explanation: The SCS is "dynprogrammicng". 
 * @author saikatkar
 *
 */
public class ShortestCommonSuperSequenceBottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "dynamic";
		String s2 = "programming";
		System.out.println(scsBottomUp(s1, s2));

	}
	public static int scsBottomUp(String s1,String s2) {
		
		int dp[][] = new int[s1.length()+1][s2.length()+1];
		
		for(int i=0;i<=s1.length();i++) {
			dp[i][0] = i;
		}
		for(int j=0;j<=s2.length();j++) {
			dp[0][j] = j;
		}
		
		for(int i=1;i<=s1.length();i++) {
			for(int j=1;j<=s2.length();j++) {
				
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = 1+ dp[i-1][j-1];
				}
				else {
					dp[i][j] = 1+ Math.min(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		System.out.println(Arrays.deepToString(dp));
		return dp[s1.length()][s2.length()];
	}

}
