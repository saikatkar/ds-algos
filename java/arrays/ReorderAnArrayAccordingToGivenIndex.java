package arrays;

import java.util.Arrays;

/**
 * Given two integer arrays of same size, “arr[]” and “index[]”, reorder elements in “arr[]” according to given index array. It is not allowed to given array arr’s length.
<br>
Example:<br><br>

Input:  arr[]   = [10, 11, 12];<br>
        index[] = [1, 0, 2];<br>
Output: arr[]   = [11, 10, 12]<br>
        index[] = [0,  1,  2] <br><br>

Input:  arr[]   = [50, 40, 70, 60, 90]<br>
        index[] = [3,  0,  4,  1,  2]<br>
Output: arr[]   = [40, 60, 90, 50, 70]<br>
        index[] = [0,  1,  2,  3,   4] <br>
Expected time complexity O(n) and auxiliary space O(1)
 * @author saikatkar
 *
 */
public class ReorderAnArrayAccordingToGivenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {50, 40, 70, 60, 90};
		int index[] = {3,  0,  4,  1,  2};
		
		int n = arr.length;
		int i =0;
		int j=-1;
		int k = -1;
		
		int temp1;
		for(i = 0;i<n;i++) {
			int temp = arr[i];
			while(i!=index[i]) {
				
				k = index[i];
				index[i] =i;
				//swap temp and arr[i]
				temp1 = temp;
				temp = arr[k];
				arr[k] = temp1;
				
				i = k;
				j++;
				
			}
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(index));
		
			
		
		

	}

}
