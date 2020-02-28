package practice;

import java.util.Arrays;

/**
 * @author saikatkar
 *
 */
public class ReverseArrayInGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {};
		reverseInGroup(arr, 3);
		
	}
	
	private static void reverseInGroup(int arr [],int k) {
		
		int jth = k-1;
		
		for(;jth<arr.length;) {
			int j =jth;
			int i = jth-k+1;
			while(i<j) {
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;j--;
			}
			jth+=k;
		}
		if(jth >= arr.length) {
			int i = jth-k+1;
			int j = arr.length-1;
			while(i<j) {
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;j--;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
