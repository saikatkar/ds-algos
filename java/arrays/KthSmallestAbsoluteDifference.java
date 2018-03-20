package arrays;

import java.util.Arrays;

/**
 * k-th smallest absolute difference of two elements in an array

	We are given an array of size n containing positive integers. The absolute difference between values at indices i and j is |a[i] – a[j]|. There are n*(n-1)/2 such pairs and we are asked to print the kth (1 <= k <= n*(n-1)/2) smallest absolute difference among all these pairs.
	<br><br>
	Input  : a[] = {1, 2, 3, 4}<br>
	         k = 3<br>
	Output : 1<br>
	The possible absolute differences are :<br>
	{1, 2, 3, 1, 2, 1}.<br>
	The 3rd smallest value among these is 1.<br>
	<br><br>
	Input : n = 2<br>
	        a[] = {10, 10}<br>
	        k = 1<br><br>
	Output : 0
 * @author saikatkar
 *
 */
public class KthSmallestAbsoluteDifference {

	public static void main(String[] args) {
		
		int arr [] = {1, 2, 3, 4};
		// TODO Auto-generated method stub
		int k = 3;
		//System.out.println(binarySearchUpperBound(arr, 0, arr.length-1, key));
		int n = arr.length;
		Arrays.sort(arr);
		int high = arr[n-1] - arr[0];
		int low = arr[1] - arr[0];
		for(int i =1;i<n-1;i++) {
			
			low = Math.min(low, arr[i+1]-arr[i]);
		}
		
		while(low<high) {
			
			int mid = (low+high)>>1;
			
			if(countPairs(arr, mid) <k) {
				low = mid+1;
			}else {
				high = mid;
			}
			
		}
		
		System.out.println(low);

	}

	public static int binarySearchUpperBound(int arr[],int low,int high,int key) {
		
		if(key>=arr[arr.length-1]) {
			return arr.length;
		}
		int mid = (low+high)>>1;
		
		if(arr[mid-1]<=key && arr[mid]>key) {
			
			return mid;
		}else if(arr[mid-1] > key) {
			
			return binarySearchUpperBound(arr, low, mid-1, key);
		}else {
			
			return binarySearchUpperBound(arr, mid+1, high, key);
		}
	}
	
	public static int countPairs(int arr[],int k) {
		int result =0;
		int n = arr.length;
		
		for(int i =0;i<n;i++) {
			result+= (binarySearchUpperBound(arr, 0, n-1, arr[i]+k)) - (i+1);
		}
		
		return result;
	}
}
