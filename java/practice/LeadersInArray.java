package practice;

/**
 * 
 * Given an array of positive integers. Your task is to find the leaders in the array.
   Note: An element of array is leader if it is greater than or equal to all the elements to its right side.
   Also, the rightmost element is always a leader. 
 * @author saikatkar
 *
 */
public class LeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,4,5,7,3};
		findLaders(arr);
	}
	
	private static void findLaders(int arr[]) {
		
		System.out.println(arr[arr.length-1]);
		int max = arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i] >= max) {
				max = arr[i];
				System.out.println(arr[i]);
			}
		}
	}

}
