package arrays;

/**
 * Given an array A[0 … n-1] containing n positive integers, <br>
 * a subarray A[i … j] is bitonic if there is a k with i <= k <= j such that <br>
 * A[i] <= A[i + 1] ... <= A[k] >= A[k + 1] >= .. A[j – 1] > = A[j].<br><br>
 * 
 * Write a function that takes an array as argument and returns the length of the maximum length bitonic subarray.


 * @author saikatkar
 *
 */
public class FindMaxBitonicLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,2,1};
		int n = arr.length;
		
		int start =0;
		int  maxLen = 1;
		int nextStart =0;
		int j=0;
		while(j<n-1) {
			//find the end of ascent
			while(j<n-1 && arr[j]<=arr[j+1]) {
				j++;
			}
			//find the end of decent
			while(j<n-1 && arr[j]>=arr[j+1]) {
				
				
				// adjusting nextStart;
                // this will be necessarily executed at least once,
                // when we detect the start of the descent
				if(j<n-1 && arr[j] > arr[j+1]) {
					
					nextStart = j+1;
				}
				j++;
			}
			maxLen = Math.max(maxLen,(j-(start-1)));
			start = nextStart;
		}
	
	
	
		
		System.out.println(maxLen);
	
 }
}
