package me.practice.tree;

import java.util.Stack;

/**
 * Given an array of numbers, return true if given array can represent preorder traversal of a Binary Search Tree, else return false. Expected time complexity is O(n).

	Examples:
	
	Input:  pre[] = {2, 4, 3}
	Output: true
	Given array can represent preorder traversal
	of below tree
	    2
	     
	      4
	     /
	    3
	
	Input:  pre[] = {2, 4, 1}
	Output: false
	Given array cannot represent preorder traversal
	of a Binary Search Tree.
	
	Input:  pre[] = {40, 30, 35, 80, 100}
	Output: true
	Given array can represent preorder traversal
	of below tree
	     40
	   /   
	 30    80 
	        
	  35     100 
	
	
	Input:  pre[] = {40, 30, 35, 20, 80, 100}
	Output: false
	Given array cannot represent preorder traversal
	of a Binary Search Tree.
 * @author saikatkar1
 *
 */
public class CheckPreorderBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pre[] = {40, 30, 35, 80, 100};
		System.out.println(checkBST(pre));

	}
	
	private static boolean checkBST(int pre[]) {
		
		Stack<Integer> stack = new Stack<Integer>();
		int root = Integer.MIN_VALUE;
		for(int i=0;i<pre.length;i++) {
			if(pre[i] < root) {
				return false;
			}
			
			while(!stack.isEmpty() && pre[i] > stack.peek()) {
				root = stack.pop();
			}
			
			stack.push(pre[i]);
		}
		
		return true;
	}

}
