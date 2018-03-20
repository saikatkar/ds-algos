package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find length of the largest subarray with sum equals to 0.<br>
 	<br><br>
	Examples:
	<br><br>
	Input: arr[] = {15, -2, 2, -8, 1, 7, 10, 23};<br><br>
	Output: 5<br><br>
	The largest subarray with 0 sum is -2, 2, -8, 1, 7<br><br>
	
	Input: arr[] = {1, 2, 3}<br><br>
	Output: 0<br><br>
	There is no subarray with 0 sum<br><br>
	
	Input: arr[] = {1, 0, 3}<br><br>
	Output: 1<br><br>
 * @author saikatkar
 *
 */
public class LargestSubArrayWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
	    int n = arr.length;
	 // Creates an empty hashMap hM
        Map<Integer, Integer> hM = new HashMap<Integer, Integer>();
 
        int sum = 0;      // Initialize sum of elements
        int max_len = 0;  // Initialize result
        
        for(int i =0;i<n;i++) {
        		
        		sum += arr[i];
        		if(arr[i] == 0 && max_len ==0) {
        			
        			max_len =1;
        		}
        		Integer prevIndex = hM.get(sum);
        		if(prevIndex!=null) {
        			max_len = Math.max(max_len,i-prevIndex);
        		}else {
        			hM.put(sum, i);
        		}
        			
        }
		
		System.out.println(max_len);
		
	}

}
