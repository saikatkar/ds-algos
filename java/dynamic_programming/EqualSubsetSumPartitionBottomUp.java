package dynamic_programming;

public class EqualSubsetSumPartitionBottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualSubsetSumPartitionBottomUp ps = new EqualSubsetSumPartitionBottomUp();
	    int[] num = { 1, 2,3,4};
	    System.out.println(ps.partition(num));

	}
	
	public boolean partition(int arr[]) {
		
		int sum =0;
		for(int i =0; i<arr.length; i++) {
			
			sum += arr[i];
		}
		if(sum%2 !=0) {
			return false;
		}else {
			sum /=2;
		}
		
		boolean dp[][] = new boolean[arr.length][sum+1];
		
		for(int i =0; i<arr.length ;i++) {
			dp[i][0] = true;
		}
		for(int s=1;s<=sum;s++) {
			
			if(s == arr[0]) {
				dp[0][s] = true; 
			}
		}
		
		for(int i=1;i<arr.length;i++) {
			for(int s = 0; s<=sum;s++) {
				
				if(dp[i-1][s]) {
					dp[i][s] = true;
				}else
				if(arr[i] <= s) {
					dp[i][s] = dp[i-1][s-arr[i]];
				}
			}
		}
		
		return dp[arr.length-1][sum];
		
	}

}
