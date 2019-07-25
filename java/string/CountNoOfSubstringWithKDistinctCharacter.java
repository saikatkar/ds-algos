package string;

import java.util.HashSet;
import java.util.Set;

/**
 * Count number of substrings with exactly k distinct characters
Given a string of lowercase alphabets, count all possible substrings (not necessarily distinct) that has exactly k distinct characters.
Examples:

Input: abc, k = 2
Output: 2
Possible substrings are {"ab", "bc"}

Input: aba, k = 2
Output: 3
Possible substrings are {"ab", "ba", "aba"}

Input: aa, k = 1
Output: 3
Possible substrings are {"a", "a", "aa"}
 * @author saikatkar
 *
 */
public class CountNoOfSubstringWithKDistinctCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbcddeffggh";
		int k =2;
		System.out.println(countNoOfSubstring(s, k));

	}
	
	public static int countNoOfSubstring(String s,int k) {
		
		int start = 0,count = 0,countDist = 0,j = 0;
		Set<Character> set = new HashSet<Character>();
		int i =0;boolean flag;
		
		while(i<s.length() || start <=s.length()-k) {
			flag = false;
			if(!set.contains(s.charAt(i))) {
				set.add(s.charAt(i));
				count++;
			}
			if(count == k) {
				countDist++;
				System.out.println(s.substring(start, i+1));
				j= i+1;
				while(j<s.length() && set.contains(s.charAt(j))) {
					countDist++;
					System.out.println(s.substring(start,j+1));
					j++;
					flag = true;
				}
				
				set.remove(s.charAt(start));
				start++;
				count--;
			}	
			if(flag) {
				i=j-1;
			}else {
				i++;
			}
		}
		return countDist;
	}

}
