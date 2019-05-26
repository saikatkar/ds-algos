package bitmanipulation;

/**
 * 
 * Given a number x, find next number with same number of 1 bits in it’s binary representation.<br>

	For example, consider x = 12, whose binary representation is 1100 (excluding leading zeros on 32 bit 
	machine). <br>
	It contains two logic 1 bits. The next higher number with two logic 1 bits is 17 (10001).
 * @author saikatkar
 *
 */
public class NextHigerNumberWithSameSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		int c0=0;
		int c1 =0;
		int c =n;
		
		while(((c&1) ==0) && c!=0) {
			
			c0++;
			c>>=1;
		}
		
		while((c&1) ==1) {
			c1++;
			c>>=1;
		}
		
		int p =c0+c1;
		if(p == 31 || p ==0) {
			System.out.println(n);
			System.exit(0);
		}
		//set the pth bit.
		n = n | (1<<p);
		
		//set the rightmost p-1 bits zero
		n = n & (~((1<<p)-1));
		//set rightmost c1-1 bits as 1
		n = n | ((1<<(c1-1))-1);
		
		System.out.println(n);
		
	}

}
