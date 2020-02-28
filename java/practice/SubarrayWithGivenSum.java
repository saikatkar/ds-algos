package practice;

/**
 * Given an unsorted array A of size N of non-negative integers, 
 * find a continuous sub-array which adds to a given number S.
 * @author saikatkar
 *
 */
public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 45;
		findSubarray(arr, sum);
	}
	
	private static void findSubarray(int arr[],int sum) {
		
		int s =0;
		int wStart =0;
		for(int wEnd=0;wEnd<arr.length;wEnd++) {
			s +=arr[wEnd];
			
			while(s>sum) {
				
				s -= arr[wStart];
				wStart ++;
			}
			if(s == sum) {
				System.out.println(wStart+" "+wEnd);
			}
		}
		
	}

}
