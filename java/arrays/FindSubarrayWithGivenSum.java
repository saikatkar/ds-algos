package arrays;

/**
 * Given an unsorted array of nonnegative integers, find a continous subarray which adds to a given number.

	Examples:
	
	Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
	Ouptut: Sum found between indexes 2 and 4
	
	Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
	Ouptut: Sum found between indexes 1 and 4
	
	Input: arr[] = {1, 4}, sum = 0
	Output: No subarray found
 * @author saikatkar
 *
 */
public class FindSubarrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 4, 20, 3, 10, 5};
		int n = arr.length;
		int x = 3;
		int currentSum = arr[0];
		int start = 0;
		boolean isFound = false;
		for(int i =1;i<=n;i++) {
			
			while(currentSum>x && start<i-1) {
				currentSum -= arr[start++];
			}
			if(currentSum==x) {
				isFound =true;
				System.out.println("Sum found between indexes "+start+" and "+(i-1));
				break;
			}
			if(i<n) {
				currentSum+=arr[i];
			}
			
			
				
		}
		if(!isFound) {
			System.out.println("No subarray found with given sum");
		}

	}

}
