package practice;

public class LongestAlternateSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,1,2,4};
		System.out.println(las(arr));
	}
	
	private static int las(int arr[]) {
		
		int dp[][] = new int[arr.length][2];
		
		for (int i=0;i<arr.length;i++) {
			dp[i][0] = 1;
			dp[i][1] = 1;
		}
		int maxLen =1;
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				
				if(arr[j] > arr[i]) {
					dp[i][0] = Math.max(dp[i][0], 1+dp[j][1]);
					maxLen = Math.max(maxLen,dp[i][0]);
				}else {
					dp[i][1] = Math.max(dp[i][1], 1+dp[j][0]);
					maxLen = Math.max(maxLen, dp[i][1]);
				}
			}
		}
		return maxLen;
	}

}
