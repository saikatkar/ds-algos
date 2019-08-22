package dynamic_programming;

/**
 * @author saikatkar
 * 
 * Given a rod of length ‘n’, we are asked to cut the rod and sell the pieces in a way that will maximize the profit. We are also given the price of every piece of length ‘i’ where ‘1 <= i <= n’.

Example:

Lengths: [1, 2, 3, 4, 5]
Prices: [2, 6, 7, 10, 13]
Rod Length: 5

Let’s try different combinations of cutting the rod:

Five pieces of length 1 => 10 price
Two pieces of length 2 and one piece of length 1 => 14 price
One piece of length 3 and two pieces of length 1 => 11 price
One piece of length 3 and one piece of length 2 => 13 price
One piece of length 4 and one piece of length 1 => 12 price
One piece of length 5 => 13 price

This shows that we get the maximum price (14) by cutting the rod into two pieces of length ‘2’ and one piece of length ‘1’.
 *
 */
public class RodCuttingBottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] prices = {2, 6, 7, 10, 13};
		int [] lengths = {1, 2, 3, 4, 5};
		
		System.out.println(rodCuttingBottomUp(lengths, prices, 5));
	}
	
	public static int rodCuttingBottomUp(int [] lengths,int [] prices,int length) {
		int dp[][] = new int[lengths.length][lengths.length+1];
		
		for(int i=0;i<lengths.length;i++) {
			
			dp[i][0] = 0;
		}
		
		for(int i=0;i<lengths.length;i++) {
			for(int len =0;len<=lengths.length;len++) {
				
				
				int p1 =0;
				if(i>0) {
					p1 = dp[i-1][len];
				}
				int p2=0;
				
				if(lengths[i] <= len) {
					p2 = dp[i][len-lengths[i]]+prices[i];
				}
				
				dp[i][len] = Math.max(p1, p2);
			}
		}
		int i = length-1;
		int len = length;
		while(i>0) {
			
			if(dp[i][len] != dp [i-1][len]) {
				
				System.out.print(lengths[i]+",");
				len -= lengths[i];
				
			}else {
				i--;
			}
		}
		
		if(len!=0) {
			System.out.println(lengths[0]);
		}
		
		return dp[lengths.length-1][lengths.length];
	}
}
