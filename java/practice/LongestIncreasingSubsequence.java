package practice;

/**
 * @author saikatkar
 *
 */
public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		int [] arr1 = {5, 8, 3, 7, 9, 1};
		int maxLength = lis(arr);
		
		System.out.println(maxLength);

	}
	
	private static int lis(int arr[]) {
		
		int dp[] = new int[arr.length];
		int maxLength =0;
		dp[0]=1;
		for(int i =1;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				
				if(arr[i] > arr[j] && dp[i] <= dp[j]) {
					dp[i] = dp[j]+1;
					maxLength = Math.max(maxLength, dp[i]);
				}
			}
		}
		
		return maxLength;
	}

}
