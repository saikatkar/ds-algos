package me.practice.tree;

import java.util.Stack;

public class LargestBSTInBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree(); 
		tree.root = new Node(5); 
        tree.root.left = new Node(4); 
        tree.root.right = new Node(6); 
        tree.root.left.left = new Node(25); 
        tree.root.left.right = new Node(2); 
//        tree.root.right.left = new Node(55); 
//        tree.root.right.left.left = new Node(45); 
//        tree.root.right.right = new Node(70); 
//        tree.root.right.right.left = new Node(65); 
//        tree.root.right.right.right = new Node(80);
//        
        int maxLength = findLargestBST(tree.root);
        System.out.println();
        System.out.println(maxLength);

	}
	
	public static int findLargestBST(Node root) {
		boolean isZero = true;
		Stack <Node> stack = new Stack<Node>();
		int maxEndingHere = 1;
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		int maxSoFar = 1;
		Node node = root;
		Node prev = null;
		while(!stack.isEmpty() || node!=null) {
			while(node!=null) {
				stack.push(node);
				node = node.left;
			}
			node = stack.pop();
			if(prev!=null && prev.key < node.key) {
				maxEndingHere++;
				isZero = false;
			}else if(prev!=null && prev.key > node.key) {
				
				maxSoFar = Integer.max(--maxEndingHere, maxSoFar);
				maxEndingHere =1;
			}
			System.out.print(node.key + " ");
			prev = node;
			node = node.right;
			
		}
		if(isZero) {
			return 0;
		}
		return Integer.max(maxSoFar,maxEndingHere);
	}

}
