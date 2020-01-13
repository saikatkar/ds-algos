package practice;

import java.util.Arrays;

/**
 * @author saikatkar
 * 
 * Segregate 0 1 and 2 in an array
 *
 */
public class DutchNationalFlagProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {1,0,0,1,2,1,0,0,2,2,1,0};
		dnfProblem(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void dnfProblem(int arr[]) {
		
		int low =0,mid =0;
		int high = arr.length-1;
		
		while(mid <= high) {
			
			switch(arr[mid]) {
				
				case 0 :
					swap(arr,low,mid);
					low++;
					mid++;
					break;
				case 1 :
					mid++;
					break;
				case 2:
					swap(arr,mid,high);
					high--;
					break;
					
			}
		}
	}
	
	public static void swap(int [] arr, int low , int mid) {
		
		int c = arr[low];
		arr[low] = arr[mid];
		arr[mid] = c;
	}

}
