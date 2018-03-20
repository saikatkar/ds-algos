package arrays;

import java.util.Stack;

/**
 * Form minimum number from given sequence<br>

Given a pattern containing only I’s and D’s. I for increasing and D for decreasing. Devise an algorithm to print the minimum number following that pattern. Digits from 1-9 and digits can’t repeat.
<br><br>
Examples:
<br><br>
   Input: D        Output: 21<br>
   Input: I        Output: 12<br>
   Input: DD       Output: 321<br>
   Input: II       Output: 123<br>
   Input: DIDI     Output: 21435<br>
   Input: IIDDD    Output: 126543<br>
   Input: DDIDDIID Output: 321654798<br>
 * @author saikatkar
 *
 */
public class FormMinimunNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(formMinNumber("DDIDDIID"));
	}
	
	public static String formMinNumber(String input) {
		
		Stack<Integer> stack = new Stack<>();
		String result ="";
		for(int i =0;i<=input.length();i++) {
			
			stack.push(i+1);
			
			if(input.length() == i ||input.charAt(i) == 'I') {
				
				while(!stack.isEmpty()) {
					
					result = result + stack.pop();
					result = result + " ";
				}
			}
		}
		
		return result;
	}

}
