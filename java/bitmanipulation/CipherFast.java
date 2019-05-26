package bitmanipulation;

/**
 * https://www.hackerrank.com/challenges/cipher
 * @author saikatkar
 *
 */
public class CipherFast
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int N=6;
		int k=2;
		int x =0;
		String s = "1110001";
		int[] result = new int[N];
		for(int i = 0;i<N;i++){
			
			if(i>=k){
				x^=result[i-k];
			}
			int c = Character.getNumericValue(s.charAt(i));
			result[i] = c^x;
			x^=result[i];
		}

		for(int i =0;i<N;i++){
			System.out.print(result[i]);
		}
	}

}
