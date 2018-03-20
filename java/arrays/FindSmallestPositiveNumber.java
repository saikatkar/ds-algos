package arrays;

import java.util.Arrays;

/**
 * Find the smallest positive number missing from an unsorted array 
	You are given an unsorted array with both positive and negative elements. You have to find the smallest positive number missing from the array in O(n) time using constant extra space. You can modify the original array.
	
	Examples
	
	 Input:  {2, 3, 7, 6, 8, -1, -10, 15}
	 Output: 1
	
	 Input:  { 2, 3, -7, 6, 8, 1, -10, 15 }
	 Output: 4
	
	 Input: {1, 1, 0, -1, -2}
	 Output: 2 
 * @author saikatkar
 *
 */
public class FindSmallestPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {0, 10, 2, -10, -20};
		int n = arr.length;
		
		for(int i=0;i<n;i++) {
			
			if(arr[i]<=0) {
				arr[i] = n+2;
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 0;i<n;i++) {
			
			if(Math.abs(arr[i])<n+1 && arr[Math.abs(arr[i])-1] >0) {
				
				arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
			}
		}
		System.out.println(Arrays.toString(arr));

		for(int i =0;i<n;i++) {
			
			if(arr[i]>0) {
				System.out.println(i+1);
				break;
			}
			
		}
		
	}

}
