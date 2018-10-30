package me.practice.tree;

import java.util.Stack;

/**
 * Given preorder traversal of a binary search tree, construct the BST.(Stack based solution)

	For example, if the given traversal is {10, 5, 1, 7, 40, 50}, then the output should be root of following tree.
	     10
	   /   \
	  5     40
	 /  \      \
	1    7      50
	
 * @author saikatkar1
 *
 */
public class PreOrderConstructionStack {

	public static void main(String[] args) {
		 int pre[] = new int[]{10, 5, 1, 7, 40, 30, 50}; 
	     PreOrderConstructionStack construct = new PreOrderConstructionStack();
	     Node root = construct.construct(pre);
	     construct.inorder(root);

	}
	private Node construct(int pre[]) {
		
		Stack <Node> stack = new Stack<Node>();
		
		Node root = new Node(pre[0]);
		stack.push(root);
		
		for(int i =1;i<pre.length;i++) {
			Node temp = null;
			while(!stack.isEmpty() && stack.peek().key < pre[i]) {
				
				temp = stack.pop();
			}
			if(temp!=null) {
				temp.right = new Node(pre[i]);
				stack.push(temp.right);
			}else {
				temp =stack.peek();
				temp.left = new Node(pre[i]);
				stack.push(temp.left);
			}
		}
		
		return root;
	}
	
	private void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.key+" ");
			inorder(root.right);
		}
		
	}

}
