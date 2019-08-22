package dynamic_programming;

/**
 * @author saikatkar
 * 
 * Given a set of positive numbers, find if we can partition it into two subsets such that the sum of elements in both the subsets is equal.
	Example 1:
	
	Input: {1, 2, 3, 4}
	
	Output: True
	
	Explanation: The given set can be partitioned into two subsets with equal sum: {1, 4} & {2, 3}
 *
 */
public class EqualSubsetSumPartitionTopDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EqualSubsetSumPartitionTopDown ps = new EqualSubsetSumPartitionTopDown();
	    int[] num = { 1, 2, 3, 4 ,5};
	    System.out.println(ps.equalSubsetPartition(num));

	}
	
	public boolean equalSubsetPartition(int arr[]) {
		
		int sum =0;
		for(int i =0; i<arr.length; i++) {
			
			sum += arr[i];
		}
		if(sum%2 !=0) {
			return false;
		}else {
			sum /=2;
		}
		
		Boolean [][] dp = new Boolean[arr.length][sum+1];
		
		return canBePartitioned(dp, arr, 0, sum);
	}
	
	public boolean canBePartitioned(Boolean dp[][],int arr[],int index,int sum) {
		
		if(sum ==0) {
			return true;
		}
		if(arr.length == 0 || index >= arr.length) {
			return false;
		}
		
		//If we have not yet processed a similar sub problem
		if(dp[index][sum] == null) {	
			
			if(arr[index] <= sum) {
				if(canBePartitioned(dp, arr, index+1, sum-arr[index])) {
					dp[index][sum] = true;
					return true;
				}
			}
			dp[index][sum] = canBePartitioned(dp, arr, index+1, sum);
			
		}
		return dp[index][sum];
	}

}
