package string;

/**
 * Check if both halves of the string have same set of characters
Given a string of lowercase characters only, the task is to check if it is possible to split a string from middle which will gives two halves having the same characters and same frequency of each character. If the length of the given string is ODD then ignore the middle element and check for the rest.

Examples:

Input : abbaab
Output : NO
The two halves contain the same characters
but their frequencies do not match so they
are NOT CORRECT

Input : abccab
Output : YES

 * @author saikatkar
 *
 */
public class CheckIfBothHalvesSameChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sabcxcabs";
		System.out.println(check(str));
	}
	
	static boolean check(String str) {
		
		int [] count1 = new int[26];
		int [] count2 = new int[26];
		
		int i,j;
		
		for(i = 0, j=str.length()-1; i<=j ; i++,j--) {
			count1[str.charAt(i)-'a'] ++;
			count2[str.charAt(j)-'a'] ++;
		}
		
		for(i =0;i<26;i++) {
			
			if(count1[i] != count2[i] && (count1[i]!= 0 && count2[i]!=0)) {
				
				return false;
				
			}
		}
		return true;
		
	}

}
