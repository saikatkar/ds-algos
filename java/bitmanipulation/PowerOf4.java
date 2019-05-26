package bitmanipulation;

/**
 * Find whether a given number is a power of 4 or not<br><br>
 * A number n is a power of 4 if following conditions are met.<br>
	a) There is only one bit set in the binary representation of n (or n is a power of 2)<br>
	b) The count of zero bits before the (only) set bit is even.
 * @author saikatkar
 *
 */
public class PowerOf4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 64;
		int count = 0;
		if((n & (n-1)) ==0) {
			
			while(n>1) {
			
				n>>=1;
				count++;
				
				
			}
		}
		if((count >0 && ((count &1) ==0) )){
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}
