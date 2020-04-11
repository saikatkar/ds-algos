package practice;

import java.util.Arrays;

public class MinJumpsWithFee {

	public static void main(String[] args) {
		
		int arr [] ={1,2,5,2,1,2};
		int arr1 [] = {2,3,4,5};
		int n =6;
		// TODO Auto-generated method stub
		System.out.println(minJumpsWithFee(arr, n));
	}
	
	private static int minJumpsWithFee(int arr[],int n) {
		
		int dp[] = new int[n+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] =0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<=i+3 && j<= arr.length;j++) {
				dp[j] = Math.min(dp[i]+arr[i] , dp[j]);
			}
		}
		System.out.println(Arrays.toString(dp));
		return dp[n];
		
	}

}
