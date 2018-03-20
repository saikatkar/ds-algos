package test;

/**
 * Count the set bits in the range from 1 to n
 * @author saikatkar
 *
 */
public class TotalBitsSetinRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getCount(7));

	}

	public static int getClosestPowerOf2(int n) {
		
		n = n | (n>>1);
		n = n | (n>>2);
		n = n | (n>>4);
		n = n | (n>>8);
		n = n | (n>>16);
		
		return (n+1)>>1;
	}
	
	public static int getCount(int n) {
		
		
		if(n <= 0) {
			
			return 0;
		}
		int m = getClosestPowerOf2(n)-1;
		
		int m1 = (32 - Integer.numberOfLeadingZeros(m))*((m+1)>>1);
		
		return getCount(n-m-1) + m1 + (n-m);
	}
}
