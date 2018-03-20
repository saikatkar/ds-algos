package arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Let us consider the following problem to understand MO’s Algorithm.

	We are given an array and a set of query ranges, we are required to find sum of every query range.
	
	Example:
	
	Input:  arr[]   = {1, 1, 2, 1, 3, 4, 5, 2, 8};
	        query[] = [0, 4], [1, 3] [2, 4]
	Output: Sum of arr[] elements in range [0, 4] is 8
        		Sum of arr[] elements in range [1, 3] is 4  
        		Sum of arr[] elements in range [2, 4] is 6
 * @author saikatkar
 *
 */
public class MOsAlgorithmSquareRootDecomposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 1, 2, 1, 3, 4, 5, 2, 8};
		int n = arr.length;
		MOsAlgorithmSquareRootDecomposition.Query q[] = {new MOsAlgorithmSquareRootDecomposition.Query(0,4,Double.valueOf(Math.sqrt(n)).intValue()),
														new MOsAlgorithmSquareRootDecomposition.Query(1,3,Double.valueOf(Math.sqrt(n)).intValue()),
														new MOsAlgorithmSquareRootDecomposition.Query(2,4,Double.valueOf(Math.sqrt(n)).intValue())
														};
		int m = q.length;
		
		Arrays.sort(q, new QueryComaparator());
		int currSum = 0;
		int currLeft =0;
		int currRight =0;
		
		for(int i =0;i<m;i++) {
			
			int left = q[i].left;
			int right = q[i].right;
			
			while(currLeft<left) {
				
				currSum-=arr[currLeft];
				currLeft++;
			}
			while(currRight<=right) {
				currSum+= arr[currRight];
				currRight++;
				
			}
			while(currLeft > left) {
				currSum+=arr[currLeft-1];
				currLeft--;
			}
			while(currRight>right+1) {
				currSum-=arr[currRight-1];
				currRight--;
				
			}
			
			System.out.println("The sum of ["+left+" and "+right+"] is "+currSum);
			
		}

	}
	
	
	static class Query{
		
		private int left;
		private int right;
		private int block;
		
		Query(int left,int right,int block){
			
			this.left = left;
			this.right = right;
			this.block = block;
		}

	}
	
	static class QueryComaparator implements Comparator<Query>{

		@Override
		public int compare(Query q1, Query q2) {
			
			if((q1.left/q1.block)!=(q2.left/q2.block)) {
				return (q1.left/q1.block - q2.left/q2.block);
			}
			
			return q1.right-q2.right;
		}
		
	}
}
