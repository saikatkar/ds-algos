package bitmanipulation;

/**
 * Swap bits in a given number<br><br>
   Given a number x and two positions (from right side) in binary representation of x,<br> 
   write a function that swaps n bits at given two positions and returns the result.<br>
   It is also given that the two sets of bits do not overlap.<br>
 * @author saikatkar
 *
 */
public class BitSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p1 =1;
		int p2 =5;
		int n =3;
		int x = 47;
		
		int set1 = (x>>p1) & ((1<<n)-1);
		int set2 = (x>>p2) & ((1<<n)-1);
		
		int xor = set1^set2;
		
		xor = (xor <<p1) | (xor<<p2);
		
		int result = x^xor;
		
		System.out.println(result);

	}

}
