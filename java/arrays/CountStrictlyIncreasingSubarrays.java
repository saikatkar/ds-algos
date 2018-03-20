package arrays;

/**
 * Given an array of integers, count number of subarrays (of size more than one) that are strictly increasing.
	Expected Time Complexity : O(n)
	Expected Extra Space: O(1)
	
	Examples:
	
	Input: arr[] = {1, 4, 3}
	Output: 1
	There is only one subarray {1, 4}
	
	Input: arr[] = {1, 2, 3, 4}
	Output: 6
	There are 6 subarrays {1, 2}, {1, 2, 3}, {1, 2, 3, 4}
	                      {2, 3}, {2, 3, 4} and {3, 4}
	
	Input: arr[] = {1, 2, 2, 4}
	Output: 2
	There are 2 subarrays {1, 2} and {2, 4}

 * @author saikatkar
 *
 */
public class CountStrictlyIncreasingSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {3,2,1};
		int n = arr.length;
		int len =1;
		int count =0;
		
		for(int i = 0;i<n-1;i++) {
			
			if(arr[i+1]>arr[i]) {
				
				len++;
			}else {
				
				count+=((len*(len-1))/2);
				len=1;
			}
			
		}
		if(len>1) {
			count+=((len*(len-1))/2);
		}
		
		System.out.println(count);
	}

}
