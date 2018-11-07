package me.practice.tree;

/**
 * Check given array of size n can represent BST of n levels or not
	Given an array of size n, the task is to find whether array can represent a BST with n levels.
	
	Since levels are n, we construct a tree in the following manner.
	Assuming a number X,
	
	Number higher than X is on the right side
	Number lower than X is on the left side.
	Note: during the insertion, we never go beyond a number already visited.
	
	Examples:
	
	Input : 500, 200, 90, 250, 100
	Output : No
	
	Input : 5123, 3300, 783, 1111, 890
	Output : Yes
 * @author saikatkar1
 *
 */
public class CheckNLevelsBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 500, 200, 90, 250, 100 }; 
		 System.out.println(check(arr));
	}
	
	public static boolean check(int arr[]) {
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		
		for(int i =1;i<arr.length;i++) {
			if(arr[i] < arr[i-1] && arr[i] > min && arr[i] < max){
				max = arr[i-1];
			}else if(arr[i] > arr[i-1] && arr[i] < max && arr[i] > min) {
				min = arr[i-1];
			}else {
				return false;
			}
		}
		
		return true;
	}

}
