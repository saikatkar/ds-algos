package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;

//import test.XoringNinja.InputReader.SpaceCharFilter;

/**
 * @author saikatkar
 *
 */
public class WhatsNext
{

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //InputReader reader = new InputReader(System.in);
		int T = 1;//reader.nextInt();
		
		for(int i =0;i<T;i++){
            int N = 2;//reader.nextInt();
            long [] numbers ={225L, 7857L}; //reader.nextLongArray(N);
			List<Long> numberList = new LinkedList<Long>();
		    for (long item : numbers) {
			  numberList.add(item);
		    }
			
			if((N&1) == 0){
				long x0 =0L;
				if(N>2){
					
					x0 = numberList.get(N-3);
					if(x0>1){
						numberList.set(N-3, x0-1);
					}
					
				}
				if(x0>1){
					numberList.add(N-2,1L);
				}else{
					numberList.set(N-4,numberList.get(N-4)+1);
				}
				
				long temp1 = numberList.get(numberList.size()-2);
				long temp0 = numberList.get(numberList.size()-1);
				
				temp0 ++;
				
				
				numberList.set(numberList.size()-2,temp0);
				if(temp1-1>0){
					numberList.set(numberList.size()-1,temp1-1);
				}else{
					numberList.remove(numberList.size()-1);
				}
				
			}else{
				long x0 =0L;
				if(N>1){
					
					x0 =numberList.get(N-2);
					if(x0>1){
						numberList.set(N-2, x0-1);
					}
					
					
				}
				long y1 = numberList.get(N-1);
				if(x0>1){
					numberList.add(N-1, 1L);
				}else{
					numberList.set(N-3, numberList.get(N-2)+1);
				}
				
				numberList.add((N-1),1L);
				if(y1-1>0){
					numberList.set(numberList.size()-1, y1-1);
				}else{
					numberList.remove(numberList.size()-1);
				}
				
			}
	            System.out.println(numberList.size());
			
			
		    for(Long item : numberList){
			 System.out.print(item+ " ");
		    }
            
			System.out.println("");
		}
	}
	
}
