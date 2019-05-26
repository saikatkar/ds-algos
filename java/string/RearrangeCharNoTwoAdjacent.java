package string;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Rearrange characters in a string such that no two adjacent are same
	Given a string with repeated characters, task is rearrange characters in a string so that no two adjacent characters are same.
	
	Note : It may be assumed that the string has only lowercase English alphabets.
	
	Examples:
	
	Input: aaabc 
	Output: abaca 
	
	Input: aaabb
	Output: ababa 
	
	Input: aa 
	Output: Not Possible
	
	Input: aaaabc 
	Output: Not Possible
 * @author saikatkar
 *
 */
public class RearrangeCharNoTwoAdjacent {

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaaabbc";
		rearrange(s);

	}
	
	public static void rearrange(String s) {
		PriorityQueue<Element> pq = new PriorityQueue<RearrangeCharNoTwoAdjacent.Element>();
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
		
		//The priority queue is ready with the elements at this point.
		Element prev = new Element('#',-1);
		String result ="";
		while(!pq.isEmpty()) {
			
			Element current = pq.remove();
			result = result + current.ch;
			current.freq--;
			if(prev.freq>0) {
				pq.add(prev);
			}
			prev = current;
			
		}
		if(s.length()!= result.length()){
			System.out.println("Rearrangement is not possible");
			return;
		}
		System.out.println("After rearrangement "+result);
	}

}
