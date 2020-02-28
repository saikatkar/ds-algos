package practice;

import java.util.Arrays;

/**
 * Given two arrays X and Y of positive integers, find number of pairs such that xy > yx (raised to power of) where x is an element from X and y is an element from Y.

Input:
The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow. Each test consists of three lines. The first line of each test case consists of two space separated M and N denoting size of arrays X and Y respectively. The second line of each test case contains M space separated integers denoting the elements of array X. The third line of each test case contains N space separated integers denoting elements of array Y.

Output:
Corresponding to each test case, print in a new line, the number of pairs such that xy > yx.

Constraints:
1 ≤ T ≤ 100
1 ≤ M, N ≤ 105
1 ≤ X[i], Y[i] ≤ 103

Example:
Input
1
3 2
2 1 6
1 5

Output
3

Explanation:
Testcase 1: The pairs which follow x^y > y^x are as such: 21 > 12,  25 > 52 and 61 > 16 


 * @author saikatkar
 *
 */
public class NumberOfPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1 [] = {2,1,6,4};
		int arr2 [] = {1,5};
		
		System.out.println(findNumberofPairs(arr1,arr2));

	}
	
	private static int findNumberofPairs(int arr1[],int arr2[]) {
		
		int count =0;
		int freq[] = new int[5];
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]<5) {
				freq[arr2[i]]++;
			}
		}
		Arrays.sort(arr1);
		
		Arrays.sort(arr2);
		
		for(int i=0;i<arr1.length;i++) {
			
			if(arr1[i] == 0) {
				continue;
			}
			if(arr1[i] == 1) {
				count += freq[0];
				continue;
			}
			
			int idx = findIndexForNumber(arr2, 0, arr2.length-1, arr1[i]);
			count += (arr2.length-idx)+freq[0]+freq[1];
			
			if(arr1[i]==2) {
				count -=(freq[3]+freq[4]);
			}
			if(arr1[i] == 3)
				count = count + freq[2];
			
		}
		
		return count;
	}
	
	private static int findIndexForNumber(int arr[],int low,int high,int k) {
		
		int m = high - (high-low)/2;
		if(high<low) {
				return high+1;
		}else if( arr[m]<k) {
			return findIndexForNumber(arr, m+1, high, k);
		}else {
			return findIndexForNumber(arr, low, m-1, k);
		}
	}

}
