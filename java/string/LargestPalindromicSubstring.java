package string;

/**
 * Given a string, find the longest substring which is palindrome. 
 * For example, if the given string is “forgeeksskeegfor”, 
 * the output should be “geeksskeeg”.

 * @author saikatkar
 *
 */
public class LargestPalindromicSubstring {
	
	public static void main(String args[]) {
		
		String s = "forgeeksskeegfor";
		
		System.out.println(findLargestPalindrome(s));
	}
	

	public static int findLargestPalindrome(String s) {
		
		//for odd length palindrome
		int max = 0;
		
		for(int i=1;i<s.length()-1;i++) {
			int low = i -1;
			int high = i +1;
			while(low>=0 && high <s.length() && s.charAt(low) == s.charAt(high)) {
				
				low--;
				high++;
			}
			if(high - low -1 >max) {
				max = high -low -1;
			}
		}
		
		//for even length palindrome
		
		for(int i=1;i<s.length()-1;i++) {
			int low = i -1;
			int high = i;
			while(low>=0 && high <s.length() && s.charAt(low) == s.charAt(high)) {
				
				low--;
				high++;
			}
			if(high - low -1 >max) {
				max = high -low -1;
			}
		}
		
		return max;
		
	}
}
