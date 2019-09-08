package dynamic_programming;

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
public class ShortestCommonSupersequenceTopDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "dynamic";
		String s2 = "programming";
		Integer [][] dp = new Integer[s1.length()][s2.length()];
		System.out.println(scsTopDown(s1, s2, dp, 0, 0));

	}
	
	public static int scsTopDown(String s1,String s2,Integer [][] dp,int i1,int i2) {
		
		if(i1 == s1.length()) {
			return s2.length()-i2;
		}
		if(i2 == s2.length()) {
			return s1.length()-i1;
		}
		
		if(dp[i1][i2] == null) {
			
			if(s1.charAt(i1) == s2.charAt(i2)) {
				
				dp[i1][i2] =  1+scsTopDown(s1, s2, dp, i1+1, i2+1);
			}else {
				
				int l1 = 1+scsTopDown(s1, s2, dp, i1+1, i2);
				int l2 = 1+scsTopDown(s1, s2, dp, i1, i2+1);
				dp[i1][i2] = Math.min(l1, l2);
			}
		}
		return dp[i1][i2];
		
	}

}
