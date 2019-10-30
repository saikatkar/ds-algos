package dynamic_programming;

/**
 * Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).

Example 1:
Input: [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3. 
Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4. 
 * @author saikatkar
 *
 */
public class LongestIncreasingContionousSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {1,3,5,0,1,4,7};
		System.out.println(lisContinous(nums));
	}
	
	public static int lisContinous(int [] nums) {
		
		int start=0,end=0,maxLength=1;
		
		
		for(int i=1;i<nums.length;i++) {
			if(nums[i] < nums[i-1]) {
				end = i-1;
				maxLength = Math.max(maxLength, end-start+1);
				start = i;
			}
		}
		
		return maxLength;
	}
}
	
