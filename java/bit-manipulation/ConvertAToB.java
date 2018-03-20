package test;

/**
 * Given two numbers ‘a’ and b’. Write a program to count number of bits 
 * needed to be flipped to convert ‘a’ to ‘b’.<br><br>

	Example :
	
	Input : a = 10, b = 20
	Output : 4
	Binary representation of a is 00001010
	Binary representation of b is 00010100
	We need to flip highlighted four bits in a
	to make it b.<br><br>
	
	Input : a = 7, b = 10
	Output : 3
	Binary representation of a is 00000111
	Binary representation of b is 00001010
	We need to flip highlighted three bits in a
	to make it b.
 * @author saikatkar
 *
 */
public class ConvertAToB
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a = 7;
		int b = 10;
		int flipBits = 0;
		int n = a^b;
		while(n>0){
			
			n&=n-1;
			flipBits++;
		}
		System.out.println(flipBits);
	}

}
