package practice;

public class MaxSumIncreaingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,101,2,3,100,4,5};
		int [] arr1 = {10,5,4,3};
		
		System.out.println(msis(arr));

	}
	
	private static int msis(int arr[]) {
		
		int dp[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			dp[i] = arr[i];
		}
		int maxSum = dp[0];
		
		for(int i=1;i<arr.length;i++) {
			for(int j =0;j<i;j++) {
				if(arr[j] < arr[i] && dp[i]<dp[j]+arr[i]) {
					dp[i] = dp[j]+arr[i];
					maxSum = Math.max(dp[i], maxSum);
				}
			}
		}
		
		return maxSum;
	}

}
