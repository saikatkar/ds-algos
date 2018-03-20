package arrays;

/**
 * 
 * 	Minimum number of jumps to reach end

	Given an array of integers where each element represents the max number of steps that can be made forward from that element. 
	Write a function to return the minimum number of jumps to reach the end of the array (starting from the first element). 
	If an element is 0, then cannot move through that element.
	Example:
	Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
	Output: 3 (1-> 3 -> 8 ->9)
	First element is 1, so can only go to 3. Second element is 3, so can make at most 3 steps eg to 5 or 8 or 9.
 * @author saikatkar
 *
 */
	public class MinNumberOfJumps {
		
		public static void main(String args[]) {
			
			int arr[] = {122, 12, 6, 1, 0, 9};
			int n = arr.length;
			int jumps[] = new int[n];
			jumps[0] = 0;
			for(int i =1;i<n;i++) {
				jumps[i] = Integer.MAX_VALUE;
				for(int j=0;j<i;j++) {
					
					if(i<=j+arr[j] && jumps[j]!=Integer.MAX_VALUE) {
						jumps[i] = Math.min(jumps[i], jumps[j]+1);
						break;
					}
				}
				
			}
			
			System.out.println(jumps[n-1]);
		}
		
 		
	}
