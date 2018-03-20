package arrays;

/**
 * An element in a sorted array can be found in O(log n) time via binary search.<br> 
 * But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand.<br> 
 * So for instance, 1 2 3 4 5 might become 3 4 5 1 2.<br> 
 * Devise a way to find an element in the rotated array in O(log n) time.
 * @author saikatkar
 *
 */
public class SortedRotatedArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {4,5,6,1,2,3};
		//int d = 3;
		int n =6;
		int key = 3;
		System.out.println(search(arr, 0, n-1, key));

	}
	
	public static int search(int [] arr,int l,int h,int key) {
		
		if(l>h) {
			return -1;
		}
		int mid = (l+h)/2;
		if(key==arr[mid]) {
			return mid;
		}
		
		/* If arr[l...mid] is sorted */ 
		if(arr[mid] >=arr[l]) {
			
			/* As this subarray is sorted, we can quickly
	           check if key lies in half or other half */
			if(arr[l] <= key && arr[mid]>=key ) {
				
				return search(arr,l,mid-1,key);
			}else {
				
				return search(arr,mid+1,h,key);
			}
		}
		 /* If arr[l..mid] is not sorted, then arr[mid... h]
	       must be sorted*/
		if(key >= arr[mid] && key <= arr[h]) {
			
			return search(arr,mid+1,h,key);
		}else {
			
			return search(arr,l,mid-1,key);
		}
	}

}
