package dynamic_programming;

/**
 * Given a staircase with ‘n’ steps and an array of ‘n’ numbers representing the fee that 
 * you have to pay if you take the step. Implement a method to calculate the minimum fee required 
 * to reach the top of the staircase. At every step, you have an option to take either 1 step, 2 steps, or 3 steps.
 *  You should assume that you are standing at the first step.

Example 1:

Number of stairs (n) : 6

Fee: {1,2,5,2,1,2}

Output: 3

Explanation: Starting from index '0', we can reach the top through: 0->3->top

The total fee we have to pay will be (1+2).
 * @author saikatkar
 *
 */
public class MinJumpsWithFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fee[] = {1,2,5,2,1,2};
		System.out.println(minJumpsWithFee(fee));

	}
	
	public static int minJumpsWithFee(int fee[]) {
		
		int dp[] = new int[fee.length+1];
		
		dp[0] =0;
		dp[1] = fee[0];
		dp[2] = fee[0];
		dp[3] = fee[0];
		
		for(int i=3;i<fee.length;i++) {
			
			dp[i+1] = Math.min(fee[i]+dp[i],Math.min(fee[i-1]+dp[i-1],fee[i-2]+dp[i-2]));
		}
		
		return dp[fee.length];
	}

}
