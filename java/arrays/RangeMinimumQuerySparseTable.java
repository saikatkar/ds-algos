package arrays;

import java.util.Arrays;

/**
 * We have an array arr[0 . . . n-1]. We should be able to efficiently find the minimum value from index L (query start) to R (query end) where 0 <= L <= R <= n-1. 
 * Consider a situation when there are many range queries.

	Example:
	
	Input:  arr[]   = {7, 2, 3, 0, 5, 10, 3, 12, 18};
	        query[] = [0, 4], [4, 7], [7, 8]
	
	Output: Minimum of [0, 4] is 0
	        Minimum of [4, 7] is 3
	        Minimum of [7, 8] is 12
 * @author saikatkar
 *
 */
public class RangeMinimumQuerySparseTable {
	

	public static void main(String[] args) {
		
		int arr[] = {7, 2, 3, 0, 5, 10, 3, 12, 18};
		int n = arr.length;
		RangeMinimumQuerySparseTable.Query q[] = {new RangeMinimumQuerySparseTable.Query(0,4),
												 new RangeMinimumQuerySparseTable.Query(4,7),
												 new RangeMinimumQuerySparseTable.Query(7,8)
												};
		int m = q.length;
		int lookUpTable[][]=createSparseTable(n, arr);
		for(int i =0;i<m;i++) {
			int r = q[i].right;
			int l = q[i].left;
			int length = r-l+1;
			int k = Double.valueOf(Math.log(length)/Math.log(2)).intValue();
			System.out.println("K "+k);
			int min = Integer.MAX_VALUE;
			while(l+Math.pow(2,k) <= r+1) {
				
				int val = arr[lookUpTable[l][k]];
				System.out.println(val);
				if(val<min) {
					min = val;
				}
				if(length - Math.pow(2, k) == 0) {
					break;
				}
				l+=(length- Math.pow(2,k));
				
				
			}
			System.out.println("The min value is "+min);
		}
		

	}
	
	public static int[][] createSparseTable(int n,int arr[]) {
		int c = Double.valueOf(Math.log(n)/Math.log(2)).intValue()+1;
		System.out.println(c);
		int lookUpTable[][] = new int[n][c];
		for(int i =0;i<n;i++) {
			lookUpTable[i][0] = i;
		}
		System.out.println(Arrays.deepToString(lookUpTable));
		int k =1;
		for(int j=1;j<c;j++) {
			for(int i=0;i<n-k;i++) {
				
				int min = Integer.MAX_VALUE;
				if(arr[lookUpTable[i][j-1]] < arr[lookUpTable[i+k][j-1]]) {
					min = lookUpTable[i][j-1];
				}else {
					min = lookUpTable[i+k][j-1];
				}
				lookUpTable[i][j] = min; 
			}
			k*=2;
		}
		System.out.println(Arrays.deepToString(lookUpTable));
		return lookUpTable;
		
	}
	
	static class Query{
		
		private int left;
		private int right;
		
		Query(int left,int right){
			
			this.left = left;
			this.right = right;
			
		}

	}

}
