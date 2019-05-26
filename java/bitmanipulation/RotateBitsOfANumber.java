package bitmanipulation;

/**
 * 
 * Bit Rotation: A rotation (or circular shift) is an operation similar to shift except 
 * that the bits that fall off at one end are put back to the other end.

	In left rotation, the bits that fall off at left end are put back at right end.

	In right rotation, the bits that fall off at right end are put back at left end.
	<br><br>
	Let n is stored using 8 bits. Left rotation of n = 11100101 by 3 makes n = 00101111 (Left shifted by 3 and first 3 bits are put back in last ). 
	If n is stored using 16 bits or 32 bits 
	then left rotation of n (000…11100101) becomes 00..0011100101000.
	Right rotation of n = 11100101 by 3 makes n = 10111100 (Right shifted by 3 and last 3 bits are put back in first ) 
	if n is stored using 8 bits. If n is stored using 16 bits or 32 bits then right rotation of n (000…11100101) by 3 becomes 101000..0011100.
 * @author saikatkar
 *
 */
public class RotateBitsOfANumber
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(leftRotate(16, 2));
		System.out.println(rightRotate(16, 2));
		

	}


	public static int leftRotate(int n,int d){
		
		return ((n<<d) | n>>(32-d));
	}
	
	public static int rightRotate(int n,int d){
		
		return ((n>>d) | n<<(32-d));
	}
}
