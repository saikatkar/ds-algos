package test;

import java.util.Scanner;

/**
 * Link to the problem statement
 * <a>https://www.hackerrank.com/challenges/xor-se
 * 
 * @author saikatkar
 *
 */
public class XorSequence
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int Q = 1;//in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            long L = 5;//in.nextLong();
            long R = 9;//in.nextLong();
            Long result = 0l;
            for(long i = L+1 ; i<=R;i++){
                result = result ^ i;
            }
            System.out.println(result);
        }

	}

}
