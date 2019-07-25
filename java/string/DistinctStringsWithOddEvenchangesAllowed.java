package string;

import java.util.HashSet;
import java.util.Set;

/**
 * Distinct strings with odd and even changes allowed
Given an array of lower case strings, the task is to find the number of strings that are distinct. Two strings are distinct if on applying the following operations on one string the second string cannot be formed.

A character on odd index can be swapped with another character at odd index only.
A character on even index can be swapped with another character on even index only.
Examples:

Input  : arr[] = {"abcd", "cbad", "bacd"}
Output : 2
The 2nd string can be converted to the 1st by swapping 
the first and third characters. So there are 2 distinct 
strings as the third string cannot be converted to the 
first.

Input  : arr[] = {"abc", "cba"}
Output : 1	
 * @author saikatkar
 *
 */
public class DistinctStringsWithOddEvenchangesAllowed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"abcd", "cbad", "bacd"};
		System.out.println(findDistinctStrings(arr));

	}
	
	
	public static int findDistinctStrings(String[] args) {
		
		
		int countDist=0;
		Set <String> distinctSet = new HashSet<String>();
		for(int i =0;i<args.length;i++) {
			int[] even = new int[26];
			int[] odd = new int[26];
			for(int j =0;j<args[i].length();j++) {
				if((j&1) == 0) {
					even[args[i].charAt(j)-'a']++;
				}else {
					odd[args[i].charAt(j)-'a']++;
				}
			}
			String encodedString ="";
			for(int k =0;k<26;k++) {
				encodedString += even[k];
				encodedString += odd[k];
				
			}
			System.out.println(args[i]);
			System.out.println(encodedString);
			if(!distinctSet.contains(encodedString)) {
				distinctSet.add(encodedString);
				countDist++;
			}
			
			
		}
		
		return countDist;
	}

}
