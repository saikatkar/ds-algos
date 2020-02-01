package arrays;

import java.util.Arrays;

/**
 * @author saikatkar
 *
 */
public class QuickSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {-2,1,0,7,9,8,5};
		int k =4;
		
		System.out.println(quickSelect(arr, 0, arr.length-1, k));
		System.out.println(Arrays.toString(arr));

	}
	
	public static int quickSelect(int arr[],int low,int high,int k) {
		
		int pivotIndex = partition(arr, low, high, k);
		//int i = pivotIndex-low;
		//System.out.println(pivotIndex);
		
		if(pivotIndex ==k-1) {
			return arr[pivotIndex];
		}else if(k>pivotIndex) {
			return quickSelect(arr, pivotIndex+1, high, k);
		}else {
			return quickSelect(arr, low, pivotIndex-1, k);
		}
		
		
	}
	
	public static int partition(int arr[],int low,int high,int k) {
		if(low == high) {
			return low;
		}
		int j =low-1;
		//int n = arr.length;
		int pivot = arr[high];
		
		for(int i=low;i<high-1;) {
			if(arr[i]<pivot) {
				j++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
			i++;
		}	
			if(arr[j+1]>pivot) {
				int temp = arr[high];
				arr[high] = arr[j+1];
				arr[j+1] = temp;
				return j+1;
			}
			
			
			return high;
		
		
	}


}
