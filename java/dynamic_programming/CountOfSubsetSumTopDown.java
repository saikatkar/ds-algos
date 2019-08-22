package dynamic_programming;

public class CountOfSubsetSumTopDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOfSubsetSumTopDown countOfSubsetSumBottomUp = new CountOfSubsetSumTopDown();
		int arr [] = {1,1,2,3};
		int sum = 4;
		Integer dp[][] = new Integer[arr.length][sum+1];
		System.out.println(countOfSubsetSumBottomUp.countRecursively(arr, sum,0,dp));

	}
	
	public int countRecursively(int arr[],int sum,int index,Integer dp[][]) {
		
		if(sum == 0) {
			return 1;
		}
		if(index >= arr.length || arr.length == 0) {
			return 0;
		}
		int sum1=0,sum2=0;
		if(dp[index][sum] == null) {
			
			 sum1 = countRecursively(arr, sum, index+1, dp);
			
			if(sum >= arr[index]) {
				sum2 = countRecursively(arr, sum-arr[index], index+1, dp);
			}
			
			dp[index][sum] = sum1+sum2;
		}
		
		return dp[index][sum];
	}

}
