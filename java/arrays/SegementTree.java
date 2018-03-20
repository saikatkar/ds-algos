package arrays;

import java.util.Arrays;

public class SegementTree {

	private static int [] segmentTree;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-1,2,4,0,1};
		constructSegementTree(arr);
		System.out.println(Arrays.toString(segmentTree));
		int min = findMinimunNumber(arr, 1, 3, 0, arr.length-1, 0);
		
		System.out.println(min);

	}
	
	
	public static void constructSegementTree(int arr[]) {
		
		int height = (int)Math.ceil(Math.log(arr.length)/Math.log(2));
        int size = 2*(int)Math.pow(2, height)-1;
        segmentTree = new int[size];
        constructST(arr, 0, arr.length-1, 0);
	}

	public static void constructST(int arr[],int low,int high,int pos) {
		System.out.println(high + " "+low);
		System.out.println("Pos "+pos);
		if(low == high) {
			segmentTree[pos] = arr[low];
			return;
		}
		
		int mid = (low+high)/2;
		
		constructST(arr, low, mid, (pos*2+1));
		constructST(arr, mid+1, high, (pos*2+2));
		segmentTree[pos] = Math.min(segmentTree[2*pos+1], segmentTree[2*pos+2]);
		
	}
	
	
	public static int findMinimunNumber(int arr[],int ql,int qh,int low,int high,int pos) {
		
		//total overlap
		if(ql<=low && qh>=high) {
			
			return segmentTree[pos];
			
		}else if(ql>high || qh<low) {
			//no overlap
			return Integer.MAX_VALUE;
		}else {
			//partial overlap
			int mid = (low+high)>>>1;
			return Math.min(findMinimunNumber(arr, ql, qh, low, mid, 2*pos+1),findMinimunNumber(arr, ql, qh, mid+1, high, 2*pos+2));
			
		}
		
		
		
		
	}
}
