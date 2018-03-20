package arrays;

/**
 * Minimum number of jumps to reach end

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
public class MinNumberOfJumpsOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int n = arr.length;
		int maxReach = arr[0];
		int steps = arr[0];
		int jumps =1;
		
		for(int i=1;i<n;i++) {
			
			if(i==n-1) {
				
				System.out.println(jumps);
			}
			maxReach = Math.max(maxReach, i+arr[i]);
			
			steps --;
			
			if(steps == 0) {
				
				jumps++;
				if(i>=maxReach) {
					System.out.println(-1);
				}
				steps = maxReach-i;
				
			}
		}
		

	}

}
