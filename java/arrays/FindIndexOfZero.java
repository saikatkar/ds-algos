package arrays;

/**
 * Find Index of 0 to be replaced with 1 to get longest continuous sequence of 1s in a binary array
Given an array of 0s and 1s, find the position of 0 to be replaced with 1 to get longest continuous sequence of 1s. Expected time complexity is O(n) and auxiliary space is O(1).
<br>
Example:
<br>
Input: 
   arr[] =  {1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1}
Output:
  Index 9
  <br>
Assuming array index starts from 0, replacing 0 with 1 at index 9 causes
the maximum continuous sequence of 1s.
<br>
Input: 
   arr[] =  {1, 1, 1, 1, 0}<br>
Output:
  Index 4<br>
  
  This problem has been solved using <b>Sliding Window Algorithm
  
 * @author saikatkar
 *
 */
public class FindIndexOfZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] =  {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
		int n = arr.length;
		int window_size =0;
		int zero_index =0;
		int last_zero_index=0;
		int window_start =0;
		int zero_count =0;
		int max_count =0;
		int result =-1;
		int m = 2;
		
		
		for(int i =0;i<n;i++) {
			
			if(arr[i]==0) {
				zero_count++;
				if(zero_count>m) {
					zero_count=1;
					window_size = i-window_start;
					window_start = zero_index+1;
					if(window_size>max_count) {
						max_count = window_size;
						result = zero_index;
					}
				}
				zero_index =i;
			}
		}
		if(n-window_start>max_count) {
			max_count = n-window_start;
			result = zero_index;
		}
		
		System.out.println("The max subsequence size is "+max_count);
		System.out.println("The index is "+result);
		
		
	}

}
