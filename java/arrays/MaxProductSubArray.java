package arrays;

/**
 * Maximum Product Subarray<br><br>
	Given an array that contains both positive and negative integers, find the product of the maximum product subarray.
	<br> Expected Time complexity is O(n) and only O(1) extra space can be used.<br>
	<br>
	Examples:
	<br><br>
	Input: arr[] = {6, -3, -10, 0, 2}<br>
	Output:   180  // The subarray is {6, -3, -10}<br>
	<br><br>
	Input: arr[] = {-1, -3, -10, 0, 60}<br>
	Output:   60  // The subarray is {60}<br>
	<br><br>
	Input: arr[] = {-2, -3, 0, -2, -40}<br>
	Output:   80  // The subarray is {-2, -40}
	
 * @author saikatkar
 *
 */
public class MaxProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, -2, -3, 0, 7, -8, -2};
	    int n = arr.length;
		int maxSoFar =arr[0];
		int minSoFar =arr[0];
		int result =arr[0];
		
		for(int i =1;i<n;i++) {
			
			if(arr[i]<0) {
				int temp = maxSoFar;
				maxSoFar = Math.max(arr[i], minSoFar*arr[i]);
				minSoFar = Math.min(arr[i], temp*arr[i]);
			}else {
				maxSoFar = Math.max(arr[i], arr[i]*maxSoFar);
				minSoFar = Math.min(arr[i], arr[i]*minSoFar);
			}
			
			if(maxSoFar > result) {
				result = maxSoFar;
			}
			
		}
		
		System.out.println(result);

	}

}
