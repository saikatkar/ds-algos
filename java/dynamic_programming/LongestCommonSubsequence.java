package dynamic_programming;

/**
 * @author saikatkar
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
 *
 */
public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abdca";
		String s2 = "cbda";
		System.out.println(lcsTopDown(s1, s2, 0, 0));

	}
	
	public static int lcsTopDown(String s1,String s2,int i1,int i2) {
		
		if(i1 == s1.length() || i2==s2.length()) {
			return 0;
		}
		
		if(s1.charAt(i1) == s2.charAt(i2)) {
			return 1+lcsTopDown(s1, s2, i1+1, i2+1);
		}else {
			int c1 = lcsTopDown(s1, s2, i1+1, i2);
			int c2 = lcsTopDown(s1, s2, i1, i2+1);
			return Math.max(c1, c2);
		}
		
	}

}
