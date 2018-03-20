package test;

/**
 * Extract ‘k’ bits from a given position in a number.
	How to extract ‘k’ bits from a given position ‘p’ in a number?
	
	<b>
	Input : number = 171
             k = 5 
             p = 2
	Output : The extracted number is 21
	171 is represented as 0101011 in binary,
	so, you should get only 10101 i.e. 21.
	
	Input : number = 72
	            k = 5 
	            p = 1
	Output : The extracted number is 8
	72 is represented as 1001000 in binary,
	so, you should get only 01000 i.e 8.
 <b>
 * @author saikatkar
 *
 */
public class ExtractKBits
{

	public static void main(String[] args)
	{
		int n = 171;
		int k =5;
		int p =2;
		
		int result = (n>>(p-1)) & ((1<<k)-1);
		System.out.println(result);

	}

}
