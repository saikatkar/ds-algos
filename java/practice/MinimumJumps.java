package practice;

import java.util.Arrays;

public class MinimumJumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,3,5,8,9,2,6,7,6,8,9};
		int [] arr1 = {1,4,3,2,6,7};
		System.out.println(minJumps(arr));

	}
	
	private static int minJumps(int arr[]) {
		
		int dp[] = new int[arr.length];
		
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[1]=1;
		
		for(int i =1;i<arr.length-1;i++) {
			
			for(int j =i+1;j<=i+arr[i] && j<arr.length;j++) {
				
				dp[j] = Math.min(dp[i]+1, dp[j]);
			}
		}
		
		return dp[arr.length-1];
	}

}
