package arrays;

/**
 * Find maximum value of Sum( i*arr[i]) with only rotations on given array allowed<br>
   Given an array, only rotation operation is allowed on array.<br> 
   We can rotate the array as many times as we want.<br> 
   Return the maximum possbile of summation of i*arr[i].<br>
 * @author saikatkar
 *
 */
public class FindTheValueMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8, 3, 1, 2};
		int n = arr.length;
		int arrSum =0;
		int curVal =0;
		for(int i = 0; i< n;i++) {
			curVal += i*arr[i];
			arrSum += arr[i];
		}
		int maxVal = curVal;
		for(int j = 1;j<n;j++) {
			
			curVal += (arrSum - n*arr[n-j]);
			if(curVal > maxVal) {
				maxVal = curVal;
			}
		}

		
		System.out.println(maxVal);
	}

}
