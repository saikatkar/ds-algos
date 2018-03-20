package arrays;

/**
 *  Largest Sum Contiguous Subarray<br>
	Write an efficient  program to find the sum of contiguous subarray<br>
	within a one-dimensional array of numbers which has the largest sum.


 * @author saikatkar
 *
 */
public class LargestSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-2, -3,- 4, -1, 2, -1, 5, -3};
		int n = a.length;
		int localMax = a[0];
		int globalMax = a[0];
		int start =0;
		int end =0;
		int s =0;
		for(int i = 1;i<n;i++) {
			
			
			localMax = Math.max(a[i], localMax+a[i]);
			if(localMax<0) {
				s = i+1;
			}
			if(localMax>globalMax) {
				end = i;
				start = s;
				
			}
			globalMax = Math.max(globalMax, localMax);
			
		}
		
		System.out.println(globalMax);
		System.out.println(start+" "+end);

	}

}
