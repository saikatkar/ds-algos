package bitmanipulation;

/**
 * Write a function Add() that returns sum of two integers. The function should not use any of the arithmetic operators (+, ++, –, -, .. etc).

	<br><br>Sum of two bits can be obtained by performing XOR (^) of the two bits.<br>
	 Carry bit can be obtained by performing AND (&) of two bits.<br>
	Above is simple Half Adder logic that can be used to add 2 single bits.<br> 
	We can extend this logic for integers. If x and y don’t have set bits at same position(s),<br> 
	then bitwise XOR (^) of x and y gives the sum of x and y. To incorporate common set bits also,<br> 
	bitwise AND (&) is used. Bitwise AND of x and y gives all carry bits. <br>
	We calculate (x & y) << 1 and add it to x ^ y to get the required result.<br>
 * @author saikatkar
 *
 */
public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(3,7));
		
	}
	
	public static int add(int x,int y) {
		
		while(y>0) {
			
			int carry = x&y;
			
			x = x^y;
			
			y = carry <<1;
		}
		return x;
	}
}
