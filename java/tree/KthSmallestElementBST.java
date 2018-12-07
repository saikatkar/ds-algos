package me.practice.tree;

import java.util.Stack;

/**
 * Find k-th smallest element in BST (Order Statistics in BST)
   Given root of binary search tree and K as input, find K-th smallest element in BST.
   
 * @author saikatkar1
 *
 */
public class KthSmallestElementBST {

	public static void main(String[] args) {
		BinarySearchTree searchTree = new BinarySearchTree();
		searchTree.insert(1);
		searchTree.insert(3);
		searchTree.insert(2);
		searchTree.insert(0);
		searchTree.insert(33);
		searchTree.insert(12);
		searchTree.insert(-1);
		searchTree.insert(-2);

		findKthSmallest(7, searchTree.root);
	}
	
	public static void findKthSmallest(int k,Node root) {
		Stack <Node> stack = new Stack<Node>();
		Node node = root;
		int i =0;
		while(!stack.isEmpty() || node!=null) {
			while(node!=null) {
				stack.push(node);
				node = node.left;
			}
			node = stack.pop();
			i++;
			if(i==k) {
				System.out.println(k+"th smallest element is "+node.key);
			}
			//System.out.print(node.key + " ");
			node = node.right;
			
		}
	}

}
