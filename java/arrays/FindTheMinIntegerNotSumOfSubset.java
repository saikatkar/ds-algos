package arrays;

/**
 * 
	Find the smallest positive integer value that cannot be represented as sum of any subset of a given array
	
	Given a sorted array (sorted in non-decreasing order) of positive numbers, find the smallest positive integer value that cannot be represented as sum of elements of any subset of given set. 
	Expected time complexity is O(n).
	
	Examples:
	
	Input:  arr[] = {1, 3, 6, 10, 11, 15};
	Output: 2
	
	Input:  arr[] = {1, 1, 1, 1};
	Output: 5
	
	Input:  arr[] = {1, 1, 3, 4};
	Output: 10
	
	Input:  arr[] = {1, 2, 5, 10, 20, 40};
	Output: 4
	
	Input:  arr[] = {1, 2, 3, 4, 5, 6};
	Output: 22
 * @author saikatkar
 *
 */
public class FindTheMinIntegerNotSumOfSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] ={1, 2, 3, 4};
		int n = arr.length;
		int result = 1;
		for(int i =0;i<n;i++) {
			
			if(result>=arr[i]) {
				result+=arr[i];
			}else {
				break;
			}
		}
		
		System.out.println(result);

	}

}
