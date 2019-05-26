package tree;

/**
 * Remove BST keys outside the given range
Given a Binary Search Tree (BST) and a range [min, max], remove all keys which are outside the given range. The modified tree should also be BST. For example, consider the following BST and range [-10, 13]. 
BinaryTree1

The given tree should be changed to following. Note that all keys outside the range [-10, 13] are removed and modified tree is BST.
 * @author saikatkar1
 *
 */
public class RemoveKeysOutsideRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree searchTree = new BinarySearchTree();
		searchTree.insert(6);
		searchTree.insert(-13);
		searchTree.insert(14);
		searchTree.insert(-8);
		searchTree.insert(15);
		searchTree.insert(13);
		searchTree.insert(7);
		searchTree.inorder();
		
		System.out.println();
		
		Node root = remove(searchTree.root, -10, 13);
		searchTree.inorder(root);

	}
	
	public static Node remove(Node root,int min,int max) {
		
		if(root == null) {				
			return null;
		}
		
		root.left = remove(root.left, min, max);
		root.right = remove(root.right, min, max);
		
		if(root.key < min) {
			Node right = root.right;
			root = null;
			return right;
		}else if(root.key > max) {
			Node left = root.left;
			root = null;
			return left;
		}
		
		return root;
	}

}
