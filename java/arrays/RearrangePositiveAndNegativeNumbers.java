package arrays;

/**
 * Rearrange positive and negative numbers in O(n) time and O(1) extra space<br>
 * An array contains both positive and negative numbers in random order. <br>
 * Rearrange the array elements so that positive and negative numbers are placed alternatively.<br> 
 * Number of positive and negative numbers need not be equal. <br>
 * If there are more positive numbers they appear at the end of the array.<br> 
 * If there are more negative numbers, they too appear in the end of the array.<br><br>

   For example, if the input array is [-1, 2, -3, 4, 5, 6, -7, 8, 9], then the output should be<br> 
   [9, -7, 8, -3, 5, -1, 2, 4, 6]
 * @author saikatkar
 *
 */
public class RearrangePositiveAndNegativeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		int j =-1;
		for(int i =0;i < arr.length;i++) {
			if(arr[i	] < 0) {
				j++;
//				arr[j] = arr[i]^arr[j];
//				arr[i] = arr[i]^arr[j];
//				arr[j] = arr[i]^arr[j];
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		int pos = j+1;
		int neg =0;
		while(neg<pos && pos<arr.length && arr[neg]<0) {
			
//			arr[pos] =  arr[pos]^arr[neg];
//			arr[neg] =  arr[pos]^arr[neg];
//			arr[pos] =  arr[pos]^arr[neg];
			int temp = arr[pos];
			arr[pos] = arr[neg];
			arr[neg] = temp;
			neg = neg+2;
			pos++;
			
		}
		System.out.println();
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}	
	}
	

}
