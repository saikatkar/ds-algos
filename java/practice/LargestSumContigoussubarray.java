package practice;

/**
 * Write an efficient program to find the sum of contiguous subarray 
 * within a one-dimensional array of numbers which has the largest sum.

 * @author saikatkar
 *
 */
public class LargestSumContigoussubarray {

	public static void main(String[] args) {

		int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println(kadaneAlgoForAllNegative(arr));
		System.out.println(kadaneNormal(arr));
	}
	
	public static int kadaneAlgoForAllNegative(int arr[]) {
		
		int maxSoFar=arr[0];
		int maxEndingHere = arr[0];
		
		for(int i =1; i<arr.length;i++) {
			
			maxEndingHere = Integer.max(arr[i], maxEndingHere+arr[i]);
			maxSoFar = Integer.max(maxEndingHere,maxSoFar);
		}
		return maxSoFar;
		
	}
	
	public static int kadaneNormal(int arr[]) {
		
		int maxSoFar=0;
		int maxEndingHere = 0;
		int start =0,end=0,s=0;
		
		for(int i =0; i<arr.length;i++) {
			
			maxEndingHere +=arr[i];
			
			if(maxEndingHere > maxSoFar) {
				maxSoFar = maxEndingHere;
				start = s;
				end = i;
			}
			
			if(maxEndingHere<0) {
				maxEndingHere=0;
				s = i+1;
			}
			
		
		}
		System.out.println("Start: "+start+" End: "+end);
		return maxSoFar;

	}

}
