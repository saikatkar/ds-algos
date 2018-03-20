package arrays;

/**
 * Given an array of integers, update every element with multiplication of previous and next elements with following exceptions. 
   <br>a) First element is replaced by multiplication of first and second.
   <br>b) Last element is replaced by multiplication of last and second last.
<br>
	Input: arr[] = {2, 3, 4, 5, 6}<br>
	Output: arr[] = {6, 8, 15, 24, 30}<br>

// We get the above output using following<br>
// arr[] = {2*3, 2*4, 3*5, 4*6, 5*6} <br>
 * @author saikatkar
 *
 */
public class ReplaceEveryElementByMultiplicationOfPreviousAndNext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {2, 3, 4, 5, 6};
		int n = arr.length;
		int temp=arr[0];
		int temp1=0;
		arr[0] = arr[0]*arr[1];
		
		for(int i=1;i<n-1;i++) {
			temp1 = arr[i];
			arr[i] = temp*arr[i+1];
			temp = temp1;
			
		}
		
		arr[n-1] = temp1*arr[n-1];
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+",");
		}

	}

}
