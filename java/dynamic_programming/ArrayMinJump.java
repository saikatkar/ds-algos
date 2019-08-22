package dynamic_programming;

/**
 * Given an array of positive numbers, where each element represents the max number of jumps that can be made forward from that element, write a program to find the minimum number of jumps needed to reach the end of the array (starting from the first element). If an element is 0, then we cannot move through that element.

Example 1:

Input = {2,1,1,1,4}

Output = 3

Explanation: Starting from index '0', we can reach the last index through: 0->2->3->4

Example 2:

Input = {1,1,3,6,9,3,0,1,3}

Output = 4

Explanation: Starting from index '0', we can reach the last index through: 0->1->2->3->8
 * @author saikatkar
 *
 */
public class ArrayMinJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jump [] =  {2,1,1,1,4};
		System.out.println(minJump(jump));

	}
	
	public static int minJump(int jump[]) {
		
		int [] dp = new int[jump.length];
		
		for(int i =1;i<dp.length;i++) {
			dp[i] = Integer.MAX_VALUE;
		}
		
		for(int start=0;start<jump.length;start++) {
			
			for(int end=start+1;end<= start+jump[start] && end < jump.length ;end++) {
				
				dp[end] = Math.min(dp[end],dp[start]+1);
			}
		}
		return dp[jump.length-1];
	}

}
