package bitmanipulation;

/**
 * https://www.hackerrank.com/challenges/cipher
 * @author saikatkar
 *
 */
public class Cipher
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int N = 6;
		int k = 2;
		String cipherText = "1110001";
		int [] original = new int[N];
		int j =0;
		int m =0;
		int p =0;
		while(N>=1){
			int x = Character.getNumericValue(cipherText.charAt(j));
			
			int result =0;
			
			for(int i =0;i<m;i++){
				result ^=original[i+p];
				
			}
			if(m<(k-1)){
				m++;
			}else{
				p++;
			}
			original[j++] = result^x;
			N--;
			
		}
		for(int i =0;i<original.length;i++){
			System.out.print(original[i]);
		}
	}

}
