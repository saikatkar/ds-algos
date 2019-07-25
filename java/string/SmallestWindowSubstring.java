package string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author saikatkar
 *
 */
public class SmallestWindowSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeksforgeeks";
		String pat = "ork";
		System.out.println(findSmallestWindowSubstring(s,pat));
	}
	
	public static String findSmallestWindowSubstring(String str,String pat) {
		
		int start = 0,startIndex=-1,minWindow=Integer.MAX_VALUE,countPat=0;
		
		Map<Character,Integer> patMap = new HashMap<Character,Integer>();
		Map<Character,Integer> strMap = new HashMap<Character,Integer>();
		
		for(int i =0;i<pat.length();i++) {
			
			if(patMap.containsKey(pat.charAt(i))) {
				
				int count = patMap.get(pat.charAt(i));
				patMap.put(pat.charAt(i), ++count);
			}
			patMap.putIfAbsent(pat.charAt(i), 1);
			
			
		}
		
		for(int j=0;j<str.length();j++) {
			
			
			if(strMap.containsKey(str.charAt(j))) {
				int count = strMap.get(str.charAt(j));
				strMap.put(str.charAt(j), ++count);
			}
			strMap.putIfAbsent(str.charAt(j), 1);
			
			if(patMap.containsKey(str.charAt(j)) && (strMap.get(str.charAt(j))<= patMap.get(str.charAt(j)))) {
				//System.out.println(str.charAt(j));
				countPat++;
			}
			
			//A window is found.
			if(countPat == pat.length()) {
				
				while((patMap.get(str.charAt(start))!=null && (strMap.get(str.charAt(start))>patMap.get(str.charAt(start))))
						|| patMap.get(str.charAt(start)) ==null) {
					
					int count = strMap.get(str.charAt(start));
					strMap.put(str.charAt(start),--count);
					start++;
				}
				if(j-start+1 < minWindow) {
					minWindow = j -start+1;
					startIndex = start;
				}
			}
		}
		if(startIndex ==-1) {
			return "No Such Window exists";
		}
		return str.substring(startIndex,startIndex+minWindow);
	} 

}
