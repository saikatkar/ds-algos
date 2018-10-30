package me.practice.tree;

/**
 * @author saikatkar1
 * Given a sorted array. Write a function that creates a Balanced Binary Search Tree using array elements.
	Examples:
	
	Input:  Array {1, 2, 3}
	Output: A Balanced BST
	     2
	   /  \
	  1    3 
	
	Input: Array {1, 2, 3, 4}
	Output: A Balanced BST
	      3
	    /  \
	   2    4
	 /
	1
 *
 */
public class SortedArraytoBST {

	public static void main(String[] args) {
		SortedArraytoBST sortedArraytoBST = new SortedArraytoBST();
		int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7}; 
        int n = arr.length; 
        Node root = sortedArraytoBST.arrayToBST(arr, 0, n - 1); 
        sortedArraytoBST.preOrder(root); 

	}
	
	private Node arrayToBST(int[] arr,int low,int high) {
		
		if(low>high) {
			return null;
		}
		
		int middle = (low+high)/2;
		Node root = new Node (arr[middle]);
		root.left = arrayToBST(arr, low, middle-1);
		root.right = arrayToBST(arr, middle+1, high);
		
		return root;
	}

	 void preOrder(Node node) { 
	        if (node == null) { 
	            return; 
	        } 
	        System.out.print(node.key + " "); 
	        preOrder(node.left); 
	        preOrder(node.right); 
	    } 

}
