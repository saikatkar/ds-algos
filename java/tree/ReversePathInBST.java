package me.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Reverse a path in BST using queue
   Given a binary search tree and a key, your task to reverse path of the binary tree.
 * @author saikatkar1
 *
 */
public class ReversePathInBST {

	Queue<Integer> queue = new LinkedList<>();
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
		
		searchTree.inorder();
		
		ReversePathInBST reversePathInBST = new ReversePathInBST();
		reversePathInBST.reversePath(searchTree.root, 12);
		System.out.println();
		searchTree.inorder();
	}

	private void reversePath(Node root,int key) {
		
		if(root.key < key) {
			
			queue.add(root.key);
			reversePath(root.right, key);
			root.key = queue.poll();
		}else if(root.key > key) {
			queue.add(root.key);
			reversePath(root.left, key);
			root.key = queue.poll();
		}else {
			queue.add(root.key);
			root.key = queue.poll();
		}
		
		
		
	}
}
