package test;

import java.util.Scanner;

/**
 * Problem link <br>
 * <a>https://www.hackerrank.com/challenges/flipping-bits/problem
 * @author saikatkar
 *
 */
public class FlippingBits
{
	public static void main(String []args){
		
		 Scanner in = new Scanner(System.in);
	        int T =1; //in.nextInt();
	        
	        for(int i = 0 ;i <T ;i++){
	            long n = 4294967295l;//in.nextInt();
	            long maxValue = (long) (Math.pow(2,32) -1);
	            System.out.println((1L <<32) -1);
	            long result = maxValue - n;
	            System.out.println(result);
	            ;
	            
	        }
	}
}
