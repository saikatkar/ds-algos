package test;

import java.util.Scanner;

/**
 * Problem link<br>
 * <a>https://www.hackerrank.com/challenges/the-great-xor<br>
 * 
 * Given a long integer,x , count the number of values of a satisfying the following conditions:<br>
 * a xor x > x
 * 0 < a < x
 * 
 * @author saikatkar
 *
 */
public class TheGreatXor
{

	static long theGreatXor(long x){
        // Complete this function
        
        int significantBits = 63 - Long.numberOfLeadingZeros(x)-1;
        long count = 0;
        while(significantBits >= 0){
            if((x & 1l<<significantBits) == 0l){
                count = count + (1l<<significantBits);
            }
            significantBits --;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = 1;//in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            long x = 9801930138l;//in.nextLong();
            long result = theGreatXor(x);
            System.out.println(result);
        }
    }
	
}
