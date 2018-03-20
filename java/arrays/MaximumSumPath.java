package arrays;

/**
 * Given two sorted arrays such the arrays may have some common elements. Find the sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays. We can switch from one array to another array only at common elements.

Expected time complexity is O(m+n) where m is the number of elements in ar1[] and n is the number of elements in ar2[].

Examples:

Input:  ar1[] = {2, 3, 7, 10, 12}, ar2[] = {1, 5, 7, 8}
Output: 35
35 is sum of 1 + 5 + 7 + 10 + 12.
We start from first element of arr2 which is 1, then we
move to 5, then 7.  From 7, we switch to ar1 (7 is common)
and traverse 10 and 12.

Input:  ar1[] = {10, 12}, ar2 = {5, 7, 9}
Output: 22
22 is sum of 10 and 12.
Since there is no common element, we need to take all 
elements from the array with more sum.

Input:  ar1[] = {2, 3, 7, 10, 12, 15, 30, 34}
        ar2[] = {1, 5, 7, 8, 10, 15, 16, 19}
Output: 122
122 is sum of 1, 5, 7, 8, 10, 12, 15, 30, 34
 * @author saikatkar
 *
 */
public class MaximumSumPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1 [] = {6, 7, 8, 9, 15, 30, 34};
		int arr2 [] = {1, 4, 7, 8, 10, 15, 16, 19};
		int m = arr1.length;
		int n = arr2.length;
		int sum1 = 0,sum2 = 0;
		int result=0;
		int i =0,j=0;
		
		for( i =0,j=0 ;i<m && j<n;) {
			
			if(arr1[i]<arr2[j]) {
				sum1 += arr1[i++];
			}else if(arr1[i]>arr2[j]){
				sum2 += arr2[j++];
			}else {
				
				result += Math.max(sum1, sum2);
				sum1=sum2=0;
				
				while(i<m && j<n && arr1[i]==arr2[j]) {
					
					result+=arr1[i++];
					j++;
				}
				
			}
		}
			
			while(i<m) {
				sum1+=arr1[i++];
			}
			while(j<n) {
				sum2+=arr2[j++];
			}
			
			result += Math.max(sum2, sum1);
		
			System.out.println(result);
	}

}
