package arrays;

/**
 * Given an array A[], write a function that segregates even and odd numbers.
 *  The functions should put all even numbers first, and then odd numbers.
	<br><br>
	Example
	<br><br>
	Input  = {12, 34, 45, 9, 8, 90, 3}<br><br>
	Output = {12, 34, 8, 90, 45, 9, 3} <br><br>
   In the output, order of numbers can be changed, i.e., in the above example 34 can come before 12 and 3 can come before 9.
 * @author saikatkar
 *
 */
public class SegregateEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 14, 5, 20, 4,15, 2, 54, 20, 87, 98, 3, 1, 32};
		int n = arr.length;
		int j =-1;
		for(int i =0;i<n;i++) {
			
			if((arr[i] & 1) ==0) {
				j++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+",");
		}

	}

}
