package me.practice.tree;

/**
 * Given a BST, transform it into greater sum tree where each node contains sum of all nodes greater than that node.
	<br>https://www.geeksforgeeks.org/transform-bst-sum-tree/
 * @author saikatkar1
 *
 */
public class BSTToGreaterSumTree {
	
	public static int sum =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(11);
		tree.insert(2);
		tree.insert(1);
		tree.insert(7);
		tree.insert(29);
		tree.insert(15);
		tree.insert(40);
		tree.insert(35);
		
		tree.inorder();
		
		BSTToGreaterSumTree sumTree = new BSTToGreaterSumTree();
		sumTree.findsum(tree.root);
		System.out.println();
		tree.inorder(tree.root);

	}
	
	public void findsum(Node root) {
		
		if(root == null)return ;
		
		findsum(root.right);
		int temp = root.key;
		root.key = sum;
		sum = sum +temp;
		findsum(root.left);
	}

}
