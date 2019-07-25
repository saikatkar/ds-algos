package string;

/**
 * Given an encoded string where repetitions of substrings are represented as substring followed by count of substrings. For example, if encrypted string is “ab2cd2” and k=4, so output will be ‘b’ because decrypted string is “ababcdcd” and 4th character is ‘b’.

	Note: Frequency of encrypted substring can be of more than one digit. For example, in “ab12c3”, ab is repeated 12 times. No leading 0 is present in frequency of substring.
	
	Examples:
	
	Input:  "a2b2c3", k = 5
	Output:  c
	Decrypted string is "aabbccc"
	
	Input:  "ab4c2ed3", k = 9
	Output :  c
	Decrypted string is "ababababccededed"
 * @author saikatkar
 *
 */
public class FindKthCharInDecryptedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a2b2c3"; int k =7;
		System.out.println(findKthChar(s, k));

	}
	public static char findKthChar(String str,int k) {
		
		int start=0,subStringLength=0,subStringChars=0,freq=0,j=0;
		
		while (start<str.length()) {	
			subStringChars = 0;
			freq = 0;
			
			while(j<str.length() && str.charAt(j) >='a' && str.charAt(j)<='z' ) {
				subStringChars++;
				j++;
			}
			
			while(j<str.length() && str.charAt(j) >='0' && str.charAt(j)<='9') {
				
				freq = freq*10 + (int)(str.charAt(j)-'0');
				j++;
			}
			subStringLength = subStringChars * freq;
			
			if(subStringLength>=k) {
				k--;
				k = k%subStringChars;
				return str.charAt(start+k);
			}else {
				start =j;
				k -= subStringLength;
				
			}
		}
		
		return str.charAt(k-1);
	}

}
