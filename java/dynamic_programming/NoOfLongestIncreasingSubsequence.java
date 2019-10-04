
package dynamic_programming;

import java.util.Arrays;

/**
 * Given an unsorted array of integers, find the number of longest increasing subsequence.

	Example 1:
	Input: [1,3,5,4,7]
	Output: 2
Explanation: The two longest increasing subsequence are [1, 3, 4, 7] and [1, 3, 5, 7].
 * @author saikatkar
 *
 */
public class NoOfLongestIncreasingSubsequence {
	
	public static void main(String [] args) {
		
		int nums[] = {2,2,2,2,2};
		int count = findNumberOfLIS(nums);
		System.out.println(count);
	}
	
    public static int findNumberOfLIS(int[] nums) {
        int length [] = new int[nums.length];
        int count [] = new int[nums.length];
        Arrays.fill(length,1);
        int countMax=0;int longest=0;
        for(int i =0;i<nums.length;i++){
            count[i] = 1;
        }
        
        for(int i =1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(length[i]<=length[j]){
                        length[i] = length[j]+1;
                        count[i] = count[j];
                    }else if(length[i]==length[j]+1){
                        
                        count[i]+=count[j];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(length));
        System.out.println(Arrays.toString(count));
        for(int  i=0;i<length.length;i++){
            if(longest < length[i]){
                longest = length[i];
            }
        }
        for(int i=1;i<count.length;i++){
            if(longest == length[i]){
                countMax += count[i];
            }
        }
		
		return countMax;
    }
}