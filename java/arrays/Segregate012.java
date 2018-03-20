package arrays;

/**
 * Given an array A[] consisting 0s, 1s and 2s, write a function that sorts A[]. 
 * The functions should put all 0s first, then all 1s and all 2s in last.
	<br><br>
	Example<br>
	Input = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};<br>
	Output = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
 * @author saikatkar
 *
 */
public class Segregate012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		int n = arr.length;
		
		int start =0;
		int end =n-1;
		for(int i =0;i<=end;) {
			
			if(arr[i]<1) {
				int temp = arr[i];
				arr[i] = arr[start];
				arr[start] = temp;
				i++;
				start++;
			}else if(arr[i]>1) {
				int temp = arr[i];
				arr[i] = arr[end];
				arr[end] = temp;
				end--;
			}else {
				i++;
			}
		}
		
		
		for(int i =0;i<n;i++) {
			
			System.out.print(arr[i]+",");
		}

	}

}
