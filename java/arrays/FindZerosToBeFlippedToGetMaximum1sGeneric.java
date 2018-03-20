package arrays;

/**
 * Given a binary array and an integer m, find the position of zeroes flipping which creates maximum number of consecutive 1’s in array.

	Examples:
	
	Input:   arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1}
	         m = 2
	Output:  5 7
	We are allowed to flip maximum 2 zeroes. If we flip
	arr[5] and arr[7], we get 8 consecutive 1's which is
	maximum possible under given constraints 
	
	Input:   arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1}
	         m = 1
	Output:  7
	We are allowed to flip maximum 1 zero. If we flip 
	arr[7], we get 5 consecutive 1's which is maximum 
	possible under given constraints.
	
	Input:   arr[] = {0, 0, 0, 1}
	         m = 4
	Output:  0 1 2
	Since m is more than number of zeroes, we can flip
	all zeroes.
	
 * @author saikatkar
 *
 */
public class FindZerosToBeFlippedToGetMaximum1sGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]  = {0, 0, 0, 1};
		int m =4;
		int n = arr.length;
		int wL=0,wR=0;
		int bestL=0,bestWindowSize =0;
		int zeroCount =0;
		
		
		while(wR<n) {
			
			if(zeroCount<=m) {
				if(arr[wR]==0) {
					zeroCount++;
				}
				wR++;
			}
			
			if(zeroCount>m) {
				if(arr[wL]==0){
					zeroCount--;
				}
				wL++;
			}
			
			if(wR-wL > bestWindowSize) {
				bestWindowSize = wR-wL;
				bestL = wL;
			
			}

		}
		System.out.println("The size of the max subsequence is "+bestWindowSize);
		System.out.println("The indexes of zero to be filpped are ");
		for(int i =0;i<bestWindowSize;i++) {

			if(arr[bestL+i] ==0) {
				
				System.out.print(bestL+i+" ");
			}
		}
	}

}
