package me.practice.tree;

/**
 * Given a Binary Search Tree(BST), convert it to a Binary Tree such that every key of the original BST is changed to key plus sum of all smaller keys in BST.

	Given a BST with N Nodes we have to convert into Binary Tree
	
	
	Given above BST with N=5 Nodes. The values at Node being 9, 6, 15, 3, 21
	
	Binary Tree after convertion
	
	
	Binary Tree after convertion, the values at Node being 18, 9, 33, 3, 54
	<br> https://www.geeksforgeeks.org/bst-tree-sum-smaller-keys/
 * @author saikatkar1
 *
 */
public class BSTToSumofSmallerKey {

	public static int sum =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(9);
		tree.insert(6);
		tree.insert(3);
		tree.insert(15);
		tree.insert(21);
		
		tree.inorder();
		
		BSTToSumofSmallerKey sumTree = new BSTToSumofSmallerKey();
		sumTree.convert(tree.root);
		System.out.println();
		tree.inorder(tree.root);

	}
	/**
	 * @param root
	 */
	public void convert(Node root) {
		
		if(root == null) {
			return;
		}
		convert(root.left);
		int temp = root.key;
		root.key+= sum;
		sum += temp;
		convert(root.right);
		
	}

}
