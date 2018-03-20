package test;

/**
 * Write an Efficient Method to Check if a Number is Multiple of 3<br><br>
 * 
 * <b>Solution</b> :<br>
 * If difference between count of odd set bits (Bits set at odd positions) 
 * and even set bits is multiple of 3 then is the number.<br><br>
 * <b>Proof</b>:
 * Let’s take the example of 2 digit numbers in decimal<br>
	AB = 11A -A + B = 11A + (B – A)<br>
	So if (B – A) is a multiple of 11 then is AB.<br>
	
	Let us take 3 digit numbers.<br>
	
	ABC = 99A + A + 11B – B + C = (99A + 11B) + (A + C – B)<br>
	So if (A + C – B) is a multiple of 11 then is (A+C-B)<br>
	
	Let us take 4 digit numbers now.<br>
	ABCD = 1001A + D + 11C – C + 999B + B – A<br>
	= (1001A – 999B + 11C) + (D + B – A -C )<br>
	So, if (B + D – A – C) is a multiple of 11 then is ABCD.<br>
	
	This can be continued for all decimal numbers.<br>
	Above concept can be proved for 3 in binary numbers in the same way.<br>
 * 
 * @author saikatkar
 *
 */
public class MultipleOf3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		System.out.println(isMultipleOf3(198));
		
		

	}

	
	public static boolean isMultipleOf3(int n){
		int odd_count = 0;
		int even_count = 0;
		
		if(n == 0){
			return true;
		}
		if(n==1){
			return false;
		}
		while(n>0){
			
			if((n&1) != 0){
				
				odd_count++;
			}
			n >>=1;
			
			if((n&1) != 0){
				
				even_count++;
			}
			n >>=1;
		}
		
		return isMultipleOf3(Math.abs(odd_count-even_count));
		
	}
}
