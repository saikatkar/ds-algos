package practice;

/**
 * Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the array. 
 * Equilibrium position in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
 * @author saikatkar
 *
 */
public class EquilibriumPointOnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,5,2,2};
		System.out.println(findEquilibriumPoint(arr));

	}
	
	private static int findEquilibriumPoint(int arr[]) {
		
		int sum = 0;
		for (int i =0;i<arr.length;i++) {
			sum += arr[i];
		}
		int leftSum =0;
		for(int i=0;i<arr.length;i++) {
			sum -=arr[i];
			if(sum == leftSum) {
				return i;
			}
			leftSum+=arr[i];
					
		}
		
		return -1;
	}

}
