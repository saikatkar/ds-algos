package arrays;

/**
 * Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements.
 * @author saikatkar
 *
 */
public class ArrayRoatationReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		int d = 3;
		int n =12;
		reverseArray(arr, 0, d-1);
		reverseArray(arr, d, n-1);
		reverseArray(arr, 0, n-1);
		
		for(int i =0; i< arr.length ; i++) {
			
			System.out.println(arr[i]);
		}

	}
	
	public static void reverseArray(int arr[],int start,int end) {
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			
			
		}
		
	}

}
