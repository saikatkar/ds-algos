package arrays;

/**
 * Given an array of n positive integers. 
 * Write a program to find the sum of maximum sum subsequence of the given array such that the integers in the subsequence are sorted in increasing order. 
 * For example, if input is {1, 101, 2, 3, 100, 4, 5}, then output should be 106 (1 + 2 + 3 + 100), 
 * if the input array is {3, 4, 5, 10}, then output should be 22 (3 + 4 + 5 + 10) and if the input array is {10, 5, 4, 3}, 
 * then output should be 10
 * @author saikatkar
 *
 */
public class MaximumSumIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 5, 4, 3};
		int n = arr.length;
		int result[] = new int[n];
		result[0] = arr[0];
		for(int i =1;i<n;i++) {
			for(int j =0;j<i;j++) {
				if(arr[i]>arr[j] && result[j]+arr[i]>result[i]) {
					result[i] = result[j]+arr[i];
				}
			}
		}
		int max = result[0];
		for(int i = 0;i<n;i++) {
			if(result[i]>max) {
				max = result[i];
			}
		}
		
		System.out.println(max);

	}

}
