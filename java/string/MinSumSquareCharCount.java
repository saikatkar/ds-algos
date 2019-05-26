package string;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Minimum sum of squares of character counts in a given string after removing k characters
Given a string of lowercase alphabets and a number k, the task is to print the minimum value of the string after removal of ‘k’ characters. The value of a string is defined as the sum of squares of the count of each distinct character. For example consider the string “saideep”, here frequencies of characters are s-1, a-1, i-1, e-2, d-1, p-1 and value of the string is 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 2^2 = 9.

Expected Time Complexity : O(n)

Examples:

Input :  str = abccc, K = 1
Output :  6
We remove c to get the value as 1^2 + 1^2 + 2^2

Input :  str = aaab, K = 2
Output :  2

 * @author saikatkar
 *
 */
public class MinSumSquareCharCount {
private static class Element implements Comparable<Element>{
		
		private char ch;
		private int freq;
		
		public Element(char ch,int freq) {
			
			this.ch = ch;
			this.freq = freq;
		}

		@Override
		public int compareTo(Element o) {
			if(this.freq == o.freq) {
				return 0;
			}else if(this.freq < o.freq) {
				return 1;
			}else return -1;
		}
	}
	
	public static void main(String args[]) {
		
		String s = "aaab";
		int k =2;
		System.out.println(findMinSum(s, k));
	}
	
	public static int findMinSum(String s,int k) {
		
		PriorityQueue<Element> pq = new PriorityQueue<MinSumSquareCharCount.Element>();
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		int i =0;
		while(i < s.length()) {
			if(map.get(s.charAt(i))!=null) {
				int freq = map.get(s.charAt(i));
				map.put(s.charAt(i), ++freq);
			}else {
				map.put(s.charAt(i), 1);
			}
			i++;
		}
		Set<Map.Entry<Character,Integer>> set= map.entrySet();
		for(Map.Entry<Character,Integer> entry : set) {
			
			Element el = new Element(entry.getKey(), entry.getValue());
			pq.add(el);
		}
		
		while(!pq.isEmpty() && k>0) {
			Element el = pq.poll();
			if(el.freq > k) {
				el.freq -= k;
				pq.add(el);
				k=0;
			}else {
				k -= el.freq;
			}
			
		}
		int result = 0;
		while(!pq.isEmpty()) {
			result += Math.pow((pq.poll().freq),2);
		}
		
		return result;
		
	}

}
