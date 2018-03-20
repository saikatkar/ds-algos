package arrays;

/**
 * Find the closest pair from two sorted arrays

Given two sorted arrays and a number x, find the pair whose sum is closest to x and the pair has an element from each array.

We are given two arrays ar1[0…m-1] and ar2[0..n-1] and a number x, we need to find the pair ar1[i] + ar2[j] such that absolute value of (ar1[i] + ar2[j] – x) is minimum.

Example:

Input:  ar1[] = {1, 4, 5, 7};
        ar2[] = {10, 20, 30, 40};
        x = 32      
Output:  1 and 30

Input:  ar1[] = {1, 4, 5, 7};
        ar2[] = {10, 20, 30, 40};
        x = 50      
Output:  7 and 40
 * @author saikatkar
 *
 */
public class FindTheClosestPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1 [] = {1, 4, 5, 7};
		int arr2 [] = {10, 20, 30, 40};
		int x = 38;
		int m = arr1.length;
		int n = arr2.length;
		int i = 0;
		int j =n-1;
		int finalI = -1,finalJ=-1;
		int minDiff = Integer.MAX_VALUE;
		
		while(i<m && j>=0) {
			
			if(Math.abs(arr1[i]+arr2[j] -x) < minDiff) {
				
				minDiff = Math.abs(arr1[i]+arr2[j] -x);
				finalI = i;
				finalJ = j;
			}
			if(arr1[i]+arr2[j] > x) {
				
				j--;
			}else {
				i++;
			}
		}
		
		System.out.println(minDiff);
		System.out.println("["+arr1[finalI]+","+arr2[finalJ]+"]");

	}

}
