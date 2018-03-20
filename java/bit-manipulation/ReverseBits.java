package test;

/**
 * Reverse the bits of an integer.
 * @author saikatkar
 *
 */
public class ReverseBits
{

	public static void main(String[] args){
		
		int number = 7;
		int result = 0;
		int i =0;
		int temp = number;
		while((i<=31) && (temp>0)){
			
			if(((number & (1<<i)) != 0)){
				result +=(1<<(31-i));
				temp = temp >>1;
			}
			i++;
		}
		
		System.out.println(result);
		System.out.println(Integer.toBinaryString(result));
		
	}
}
