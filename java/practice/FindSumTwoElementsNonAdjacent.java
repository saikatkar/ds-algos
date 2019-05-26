package practice;

/**
 * Maximum sum such that no two elements are adjacent
	Given an array of positive numbers, find the maximum sum of a subsequence with the constraint 
	that no 2 numbers in the sequence should be adjacent in the array. So 3 2 7 10 should return 13 
	(sum of 3 and 10) or 3 2 5 10 7 should return 15 (sum of 3, 5 and 7).Answer the question in most
	 efficient way.

Examples :

Input : arr[] = {5, 5, 10, 100, 10, 5}
Output : 110

Input : arr[] = {1, 2, 3}
Output : 4

Input : arr[] = {1, 20, 3}
Output : 20
 * @author saikatkar
 *
 */
public class FindSumTwoElementsNonAdjacent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1, -1, 3, 9, 2};
		System.out.println(findSum(arr));

	}
	public static int findSum(int arr[]) {
		
		int excl = 0;
		int incl = arr[0];
		
		for(int i =1;i<arr.length;i++) {
			
			int excl_new = incl > excl ? incl:excl;
			
			incl = excl+arr[i];
			
			excl = excl_new;
			
		}
		return Integer.max(incl, excl);
	}

}
