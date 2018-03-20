package test;

public class LoneNumber
{

	public static void main(String [] args){
		
		int k =7;
		long numbers [] = new long[]{8,7,6,5,5,6,7};
        int result = 0;
        
        for(int j =0 ; j<k ; j++){
            
            result ^= numbers[j];
        }
        
        result = (result == 0)?-1:result;
        System.out.println(result);
	}
}
