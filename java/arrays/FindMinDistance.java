package arrays;

/**
 * Find the minimum distance between two numbers

Given an unsorted array arr[] and two numbers x and y, find the minimum distance between x and y in arr[]. The array might also contain duplicates. You may assume that both x and y are different and present in arr[].

Examples:
Input: arr[] = {1, 2}, x = 1, y = 2
Output: Minimum distance between 1 and 2 is 1.

Input: arr[] = {3, 4, 5}, x = 3, y = 5
Output: Minimum distance between 3 and 5 is 2.

Input: arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3}, x = 3, y = 6
Output: Minimum distance between 3 and 6 is 4.

Input: arr[] = {2, 5, 3, 5, 4, 4, 2, 3}, x = 3, y = 2
Output: Minimum distance between 3 and 2 is 1.
 * @author saikatkar
 *
 */
public class FindMinDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
		int x =3;
		int y =6;
		int n = arr.length;
		int minDiff = Integer.MAX_VALUE;
		int prev = 0;
		//int now = Integer.MAX_VALUE;
		//int previous = Integer.MAX_VALUE;
		int i =0;
		for( i =0;i<n;i++) {
			
			if(arr[i] == x || arr[i] ==y) {
				
				prev =i;
				break;
				
			}
		}
		
		for(;i<n;i++) {
			
			if(arr[i] == x|| arr[i]==y) {
				
				if(arr[i] !=arr[prev] && (i-prev)<minDiff) {
					
					minDiff = i-prev;
					prev =i;
				}else {
					prev =i;
				}
			}
		}
		
		System.out.println(minDiff);
	}

}
