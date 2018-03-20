package test;

import java.util.Scanner;

public class CounterGame
{

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
        int T =1; //scan.nextInt();
        long N = 1913914969;//scan.nextLong();
        scan.close();
        boolean contender =true;
        
        for(int i =0 ;i <T ;i++){
        	
        	while(N!=2){
        		
        		if((N &(N-1)) == 0){
        			//Power of 2
        			N = N>>1;
        			contender = !contender;
        		}else{
        			long p = N;
        			p|= p>>1;
        			p|= p>>2;
        			p|= p>>4;
        			p|= p>>8;
        			p|= p>>16;
        			p|= p>>32;
        			
        			N = (p+1)>>1;
        			
        			
        		}
        		
        		
        	}
        	String result = contender == true ? "Louise":"Richard";
        	System.out.println(result);
        }
        
	}

	
    

}
