package me.practice.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary search tree which is also a complete binary tree. The problem is to convert the given BST into a Min Heap with the condition that all the values in the left subtree of a node should be less than all the values in the right subtree of the node. This condition is applied on all the nodes in the so converted Min Heap.

	Examples:
	
	Input :          4
	               /   \
	              2     6
	            /  \   /  \
	           1   3  5    7  
	
	Output :        1
	              /   \
	             2     5
	           /  \   /  \
	          3   4  6    7 
	
	The given BST has been transformed into a
	Min Heap.
	All the nodes in the Min Heap satisfies the given
	condition, that is, values in the left subtree of
	a node should be less than the values in the right
	subtree of the node. 
 * @author saikatkar1
 *
 */
public class BSTToMinHeap {

	List<Integer> inorderList = new ArrayList<Integer>();
	int index = 0;
	
	//Node heapRoot = new Node(key)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree searchTree = new BinarySearchTree();
		searchTree.insert(1);
		searchTree.insert(3);
		searchTree.insert(2);
		searchTree.insert(0);
		searchTree.insert(33);
		searchTree.insert(12);
		searchTree.insert(-1);
		searchTree.insert(-2);
	
		
		searchTree.inorder();
		System.out.println();
		
		BSTToMinHeap bstToMinHeap = new BSTToMinHeap();
		bstToMinHeap.convert(searchTree.root);

	}
	
	private void convert(Node root) {
		inorder(root);
		preOrderTree(root);
		BinarySearchTree.inorderStack(root);
		System.out.println();
		BinarySearchTree.preorderStack(root);
		
	}
	
	private void preOrderTree(Node root) {
		if(root==null) {
			return ;
		}
		root.key = inorderList.get(index++);
		preOrderTree(root.left);
		preOrderTree(root.right);
	}
	
	private void inorder(Node root) {
		
		if(root==null) return ;
		
		inorder(root.left);
		inorderList.add(root.key);
		inorder(root.right);
		
	}

}
