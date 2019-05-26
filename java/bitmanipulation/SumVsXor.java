package bitmanipulation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sum-vs-xor<br><br>
 * 
 * Given an integer, n, find each x such that:<br>
 * o<=x<=n<br>
 * n+x = n xor x
 * <br><br>
 * Print the total number of integer x's satisfying both of the conditions specified above.
 * 


 * @author saikatkar
 *
 */
public class SumVsXor
{
	
	static long solve(long n) {
        
        long zeros = 0l;
        while(n>0){
            
            if((n&1l)== 0l){
                zeros++;
            }
            n = n>>1;
        }
        return (1l<<zeros);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long result = solve(n);
        System.out.println(result);
    }

}
