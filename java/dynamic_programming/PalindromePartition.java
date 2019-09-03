package dynamic_programming;

/**
 * Given a string, we want to cut it into pieces such that each piece is a palindrome. 
 * Write a function to return the minimum number of cuts needed.

Example 1:

Input: "abdbca"

Output: 3

Explanation: Palindrome pieces are "a", "bdb", "c", "a".

Example 2:

Input: = "cddpd"

Output: 2

Explanation: Palindrome pieces are "c", "d", "dpd".

Example 3:

Input: = "pqr"

Output: 2

Explanation: Palindrome pieces are "p", "q", "r".

Example 4:

Input: = "pp"

Output: 0

Explanation: We do not need to cut, as "pp" is a palindrome.
 * @author saikatkar
 *
 */
public class PalindromePartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	public int palindromePartition(Integer [][] dp,Boolean [][] isDPPalindrome,int start,int end,String str) {
			
		if(start >= end || isPlaindrome(isDPPalindrome, str, start, end)) {
			return 0;
		}
		if(dp[start][end]==null) {
			
			int minCuts = end-start+1;
			for(int i=start;i<=end;i++) {
				if(isPlaindrome(isDPPalindrome, str, start, i)) {
					dp[start][end] = Math.min(minCuts, 1+palindromePartition(dp, isDPPalindrome, i+1, end, str));
				}
			}
		}
		return dp[start][end];
	}
	
	public boolean isPlaindrome(Boolean [][] isDPPalindrome,String str,int x ,int y) {
		if(isDPPalindrome[x][y]) {
			int i =x;
			int j =y;
			isDPPalindrome[x][y] = true;
			
			while(i<j) {
				if(str.charAt(i++)!=str.charAt(j--)) {
					isDPPalindrome[x][y] = false;
					break;
				}
				if(i<j && isDPPalindrome[i][j]!=null) {
					isDPPalindrome[x][y] = isDPPalindrome[i][j];
					break;
				}
			}
		}
		return isDPPalindrome[x][y];
	}

}
